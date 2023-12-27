package com.cdf.ProyectoThyleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@SpringBootApplication
@EnableWebMvc // Habilita la configuración de recursos web
public class ProyectoThyleafApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProyectoThyleafApplication.class, args);
	}
	// Configuración adicional si es necesario
	@Bean
	public WebMvcConfigurer webMvcConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addResourceHandlers(ResourceHandlerRegistry registry) {
				registry.addResourceHandler("/static/**") // La ruta que mapea a tus recursos estáticos
						.addResourceLocations("classpath:/static/"); // La ubicación real de tus recursos estáticos
			}
		};
	}
}