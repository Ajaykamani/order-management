package com.cts.training.AccessoryService;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@EnableEurekaClient
@EnableSwagger2
@EntityScan(basePackages = "com.cts.*")
@SpringBootApplication
public class AccessoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccessoryServiceApplication.class, args);
	}
	
	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2)
			 										.select()
			 										.paths(PathSelectors.any())
			 										.apis(RequestHandlerSelectors.basePackage("com.cts"))
			 										.build()
			 										.apiInfo(apiInfo());
	}
	private ApiInfo apiInfo() {
		 return new ApiInfo("SeriesModel Service API",
			 								"selecting series and models of car",
			 								"1.0",
			 								"Free to use",
			 								new springfox.documentation.service.Contact("Batch 2", "https://github.com/Ajaykamani/order-management", "ordercar.com") ,
			 								"batch2 license",
			 								"https://github.com/Ajaykamani/order-management",
			 								Collections.emptyList());

	 }


}
