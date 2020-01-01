package com.cloudpassion.microservices.restfulwebservice;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {
//	
//private static final ApiInfo DEFAULT_API_INFO = null;
//public static final Contact DEFAULT_CONTACT = new Contact("Anurag Gupta", "http://cloudpassion.com", "Anurag4516");
//public static final ApiInfo DEFAULT = new ApiInfo("AnuragApi Documentation", 
//		"Api Documentation", 
//		"1.0", "urn:tos",
//        DEFAULT_CONTACT, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0");

@Bean
public Docket apiTest()
{
	return new Docket(DocumentationType.SWAGGER_2)
//			.apiInfo(DEFAULT_API_INFO)
			;
}

}
