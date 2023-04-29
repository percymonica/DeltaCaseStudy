package com.delta.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Collection;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.delta.entity.Flight;
import com.delta.exception.FlightException;
import com.delta.service.FlightService;



@CrossOrigin()
@EnableTransactionManagement
@RestController
@RequestMapping("/flight")
public class FlightController {
	
	@Autowired
	FlightService fservice;
	
	@PostMapping(value = "/add",consumes = "application/json")
	public String saveFlight(@RequestBody Flight flight, HttpSession session) {		
			Flight id=fservice.saveFlight(flight);
			return "Flight added with flight number "+id;
 
	}
	
	@GetMapping(value="/fetch",produces="application/json")
	public ResponseEntity<?> searchFlight(@RequestParam String stationName, @RequestParam String date, @RequestParam String timeframe, @RequestParam String from, @RequestParam String to){
		try {
			
			LocalDate dt=LocalDate.parse(date);
			LocalTime tm=LocalTime.parse(timeframe);
			LocalTime tm1=LocalTime.parse(timeframe);
			LocalTime tm2=LocalTime.parse(timeframe);
			Collection<Flight> flights = fservice.fetchFlightsOnCondition(stationName, dt, tm, tm1, tm2);
			return new ResponseEntity< Collection<Flight> >(flights,HttpStatus.OK);
			
		} catch (FlightException e) {
			
			e.printStackTrace();
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.NOT_FOUND);
		}
	}

}
