package com.example.springmodelvalidationdemo.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.List;

@Configuration
public class SwaggerConfig {
    @Bean
    public Docket getDocketForSwagger() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2);

        return docket.select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(new ApiInfo(
                        "Documentation Title here",
                        "Description here",
                        "version number here",
                        "terms of service url here",
                        new Contact(
                               "Contact Person Name",
                               "Contact URL",
                                "Contact Email"
                        ),
                        "Licence type",
                        "Licence info URL",
                        List.of()    //vendor extensions
                ));
    }
}
