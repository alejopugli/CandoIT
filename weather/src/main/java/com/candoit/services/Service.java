package com.candoit.services;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.reactive.function.client.WebClient;

import com.candoit.DTO.CityDTO;
import com.candoit.DTO.Rol;
import com.candoit.DTO.User;
import com.candoit.DTO.WeatherDTO;
import com.candoit.repositories.Repository;

import reactor.core.publisher.Mono;

@Transactional
public class Service {

    @Autowired
    private Repository repository;

    private WebClient webClient;

    public Service() {
    }

    public Service(WebClient.Builder builder, Repository aRepository) {
        this.repository = aRepository;
        webClient = builder.baseUrl("https://ws.smn.gob.ar/map_items").build();
    }

    public List<WeatherDTO> findAllWeathers() {
        return repository.findAllWeathers();
    }

    public List<CityDTO> findAllCities() {
        return repository.findAllCities();
    }

    public List<User> findAllUsers() {
        return repository.findAllUsers();
    }

    public Optional<User> findUserByUsername(String username) {
        return this.repository.findUserByUsername(username);
    }

    public User createUser(String username, String password, Boolean enable, Set<Rol> rols) throws Exception {
        User user = new User(username, password, enable, rols);
        this.repository.save(user);
        return user;
    }

    public CityDTO[] getCities() {
        Mono<CityDTO[]> response = webClient.get()
                .uri("/weather")
                .retrieve()
                .bodyToMono(CityDTO[].class);
        CityDTO[] cities = response.block();
        return cities;
    }

    @Scheduled(fixedDelay = 300000)
    public void saveRequest() throws Exception {
        CityDTO[] cities = this.getCities();
        try {
            for (CityDTO city : cities) {
                this.repository.save(city);
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}
