package com.flight.service;

import java.util.List;
import com.flight.dto.Airport;

public interface AirportService {

        //Get All the Airports
	    List<Airport>getAllAirport();
	    //Get the airport by airportId
	    Airport getAirportById(long airportid);
	    //create 
	    Airport saveAirport(Airport airport);
}
	    


