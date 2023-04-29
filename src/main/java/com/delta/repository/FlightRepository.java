package com.delta.repository;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.delta.entity.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
	
	@Query("select flightno from Flight")
	List<Flight> findByCondition(String stationName, LocalDate date, LocalTime timeframe, LocalTime from, LocalTime to);


}
