package com.example.mypkg.config;

import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.module.SimpleModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public Module dynamoDemoEntityDeserializer() {
        SimpleModule module = new SimpleModule();
        module.addDeserializer(Boolean.class, new CustomBooleanDeserializer());
        return module;
    }
}
