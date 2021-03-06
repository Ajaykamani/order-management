package com.cts.training.SeriesModelService.controller;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.cts.training.SeriesModelService.model.User;
//import com.cts.training.SeriesModelService.model.UserModel;
import com.cts.training.SeriesModelService.repository.UserRepository;
import com.cts.training.entities.Entities.Models.User;
import com.cts.training.entities.Entities.Models.UserModel;

import lombok.extern.slf4j.Slf4j;


//@RequestMapping("/login")
@ControllerAdvice
@RestController
@Slf4j
public class LoginController {
	
	@Autowired
	private UserRepository userRepository;
	

	@GetMapping("/login")
	//ResponseEntity<UserModel> 
	public  User login(HttpServletRequest request) {
		// if called then credentials are valid
		log.info("iN login controller");
		String authorization = request.getHeader("Authorization");
		String[] values = null;

		if (authorization != null && authorization.startsWith("Basic")) {
			// Authorization: Basic base64credentials
			String base64Credentials = authorization.substring("Basic".length()).trim();
			byte[] credDecoded = Base64.getDecoder().decode(base64Credentials);
			String credentials = new String(credDecoded, StandardCharsets.UTF_8);
			// credentials = username:password
			values = credentials.split(":", 2);
			}
		
		User user = this.userRepository.findByuserName(values[0]).get(0);//
		log.info("login controller"+values[0]);
		//UserModel data = new UserModel(user.getUserId(),user.getUserName());
	//	return new ResponseEntity<UserModel>(data, HttpStatus.OK);
		return user;
	}

}


