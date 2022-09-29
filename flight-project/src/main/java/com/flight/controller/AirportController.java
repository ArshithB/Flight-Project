package com.flight.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flight.dto.Airport;
import com.flight.service.AirportService;

@RestController
@RequestMapping("/airport")
public class AirportController {
	
	private AirportService airportService;

	public AirportController(AirportService airportService) {
		super();
		this.airportService = airportService;
	}
	
	@PostMapping
	public ResponseEntity<Airport> saveAirport(@RequestBody Airport airport){
		return new ResponseEntity<Airport>(airportService.saveAirport(airport),HttpStatus.CREATED);
		
	}
	@GetMapping
	public List<Airport> getAllAirport(){
		return airportService.getAllAirport();
		
	}
	@GetMapping("{airportid}")
	public ResponseEntity<Airport> getAirportById(@PathVariable("airportid") int airportid,@RequestBody Airport airport){
		return new ResponseEntity<Airport>(airportService.getAirportById(airportid),HttpStatus.OK);
		
	}

}