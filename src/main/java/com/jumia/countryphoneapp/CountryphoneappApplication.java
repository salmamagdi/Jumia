package com.jumia.countryphoneapp;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@SpringBootApplication
@EnableAsync
@EnableSwagger2
public class CountryphoneappApplication {

    public static void main(String[] args) {
        SpringApplication.run(CountryphoneappApplication.class, args);
    }
    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.jumia.countryphoneapp"))
                .paths(paths())
                .build()
                ;
    }

    private Predicate<String> paths()
    {
        return Predicates.or(
                PathSelectors.regex("/api.*"))
                ;
    }
}
