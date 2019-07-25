package com.mybatis.plus.config.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.annotations.Api;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class Swagger2Configuration {

	 @Bean
	    public Docket docket() {
	        return new Docket(DocumentationType.SWAGGER_2)
	                .apiInfo(apiInfo())
	                .select()
	                // 这里是全局扫描有@Api注解得类，还可以扫描任意位置，指定包以及针对方法上的指定注解
	                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class)) 
	                .paths(PathSelectors.any())
	                .build();
	    }
	 
	    private ApiInfo apiInfo() {
	        return new ApiInfoBuilder()
	                .title("Title")
	                .description("Description")
	                .termsOfServiceUrl("")
	                .contact(new Contact("", "", ""))
	                .license("")
	                .licenseUrl("")
	                .version(" 1.0.0 ")
	                .build();

	    }
}
