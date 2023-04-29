package com.delta.service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delta.entity.Flight;
import com.delta.exception.FlightException;
import com.delta.repository.FlightRepository;

@Service
public class FlightServiceImpl implements FlightService {
	
	@Autowired
	private FlightRepository frepo;


	@Override
	public Flight saveFlight(Flight flight) {
		return frepo.save(flight);
	}

	@Override
	public List<Flight> fetchFlightsOnCondition(String stationName, LocalDate date, LocalTime timeframe, LocalTime from,
			LocalTime to) throws FlightException{
		
		List<Flight> flights;
		flights = frepo.findByCondition(stationName, date, timeframe, from, to);
		if(flights!=null) {
			return flights;
		}else {
			throw new FlightException("Flights not found with provided details");
		}
	}


}
