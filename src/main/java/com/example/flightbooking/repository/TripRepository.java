package com.example.flightbooking.repository;

import com.example.flightbooking.model.Trip;
import org.springframework.data.repository.CrudRepository;

public interface TripRepository extends CrudRepository<Trip, Integer> {
}
