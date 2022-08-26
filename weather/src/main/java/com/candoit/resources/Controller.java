package com.candoit.resources;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.candoit.DTO.CityDTO;
import com.candoit.DTO.User;
import com.candoit.DTO.WeatherDTO;
import com.candoit.services.Service;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private Service service;

    @GetMapping(value = "/get_cities")
    public ResponseEntity<List<CityDTO>> cities() throws ParseException {
        List<CityDTO> cities = service.findAllCities();
        return ResponseEntity.ok(cities);
    }

    @GetMapping(value = "/get_weathers")
    public ResponseEntity<List<WeatherDTO>> weathers() throws ParseException {
        List<WeatherDTO> weathers = service.findAllWeathers();
        return ResponseEntity.ok(weathers);
    }

    @GetMapping(value = "/get_users")
    public ResponseEntity<List<User>> users() throws ParseException {
        List<User> users = service.findAllUsers();
        return ResponseEntity.ok(users);
    }

}
