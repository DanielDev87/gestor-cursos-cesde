package com.cesde.cursos.gestor_cursos.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Configuración de CORS global
        registry.addMapping("/api/**") // La ruta base de tu API
                .allowedOrigins("http://localhost:5173") // URL de tu frontend React
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Métodos permitidos
                .allowedHeaders("*")  // Permite todos los encabezados
                .allowCredentials(true); // Permite enviar cookies, tokens, etc.
    }
}
