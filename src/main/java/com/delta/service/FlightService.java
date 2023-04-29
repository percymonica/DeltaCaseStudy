package com.delta.service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.delta.entity.Flight;
import com.delta.exception.FlightException;

public interface FlightService {
	
	public Flight saveFlight(Flight flight);
	
	public List<Flight> fetchFlightsOnCondition(String stationName, LocalDate date, LocalTime timeframe, LocalTime from, LocalTime to) throws FlightException;

}
