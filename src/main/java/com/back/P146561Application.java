package com.back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.config.EnableElasticsearchAuditing;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
@SpringBootApplication
@EnableElasticsearchRepositories
public class P146561Application {

    public static void main(String[] args) {
        SpringApplication.run(P146561Application.class, args);
    }

}
