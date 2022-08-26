package com.candoit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.Builder;

import com.candoit.repositories.Repository;
import com.candoit.services.Service;

@Configuration
@EnableScheduling
public class AppConfig {
    @Bean
    public Service createService() {
        Repository repository = this.createRepository();
        Builder client = WebClient.builder();
        return new Service(client, repository);
    }

    @Bean
    public Repository createRepository() {
        return new Repository();
    }
}
