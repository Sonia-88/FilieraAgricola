package com.ids.ProgettoIDS.Config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(title = "API Anagrafica", version = "1.0", description = "Gestione delle anagrafiche")
)
public class SwaggerConfig {
}
