package com.bytes.cards;

import com.bytes.cards.dto.CardsContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = {CardsContactInfoDto.class})
@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Cards microservice REST API Documentation",
				description = "EazyBank Cards microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Trentor",
						email = "tutor@eazybytes.com",
						url = "https://www.trentor.com.br"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.trentor.com.br"
				)
		),
		externalDocs = @ExternalDocumentation(
				description =  "EazyBank Cards microservice REST API Documentation",
				url = "https://www.trentor.com.br/swagger-ui.html"
		)
)
public class CardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardsApplication.class, args);
	}

}
