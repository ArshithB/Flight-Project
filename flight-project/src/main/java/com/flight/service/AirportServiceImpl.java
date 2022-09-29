package com.flight.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.flight.dao.AirportDao;
import com.flight.dto.Airport;
import com.flight.exception.DataNotFoundException;

@Service
public class AirportServiceImpl implements AirportService {
	private AirportDao airportDao;
	public AirportServiceImpl(AirportDao airportDao) {
		super();
		this.airportDao = airportDao;
	}
	
	//get all:
	@Override
	public List<Airport> getAllAirport() {
		return airportDao.findAll();
	}
	//Create:
	@Override
	public Airport saveAirport(Airport airport) {
		return airportDao.save(airport);
	}

	//Get by ID:
	@Override
	public Airport getAirportById(long airportid) {
		return airportDao.findById(airportid).orElseThrow( ()->
		new DataNotFoundException("Airport", "ID", airportid));
		
	}


}