package com.junu.web_community_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class WebCommunityBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebCommunityBackendApplication.class, args);
	}

}
