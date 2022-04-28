package com.example.flightbooking.controller;

import com.example.flightbooking.model.Flight;
import com.example.flightbooking.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;

@CrossOrigin
@RestController
@RequestMapping(path = "/flight")
public class FlightController {
    @Autowired
    FlightRepository flightRepository;

    @GetMapping
    public @ResponseBody Iterable<Flight> getFlight(){
       return flightRepository.findAll();
    }

    @PostMapping(path = "/addFlight")
    public Flight addFlight(@RequestBody Flight flight){
        return flightRepository.save(flight);
    }
}
