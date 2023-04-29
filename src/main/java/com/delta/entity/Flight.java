package com.delta.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flight")
public class Flight {
	
	@Id
	@Column(name="flightno")
	private long flightno;
	
	@Column(name="stationName")
	private String stationName;
	
	@Column(name="date")
	private LocalDate date;
	
	@Column(name="time")
	private LocalTime time;
	
	@Column(name="shipno")
	private long shipno;
	
	@Column(name="skd")
	private LocalTime skd;
	
	@Column(name="etd")
	private LocalTime etd;

	@Column(name="delayout")
	private LocalTime delayout;

	@Column(name="ska")
	private LocalTime ska;
	
	@Column(name="eta")
	private LocalTime eta;
	
	@Column(name="delayin")
	private LocalTime delayin;
	
	@Column(name="to")
	private String to;
	
	@Column(name="from")
	private String from;
	
	@Column(name="gateno")
	private long gateno;
	
	@Column(name="flag")
	private String flag;

	public Flight() {
		// TODO Auto-generated constructor stub
	}

	public Flight(String stationName, LocalDate date, LocalTime time, long shipno, LocalTime skd, LocalTime etd,
			LocalTime delayout, LocalTime ska, LocalTime eta, LocalTime delayin, String to, String from, long gateno, String flag) {
		super();
		this.stationName = stationName;
		this.date = date;
		this.time = time;
		this.shipno = shipno;
		this.skd = skd;
		this.etd = etd;
		this.delayout = delayout;
		this.ska = ska;
		this.eta = eta;
		this.delayin = delayin;
		this.to = to;
		this.from = from;
		this.gateno = gateno;
		this.flag = flag;
	}

	public long getFlightno() {
		return flightno;
	}

	public void setFlightno(long flightno) {
		this.flightno = flightno;
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public long getShipno() {
		return shipno;
	}

	public void setShipno(long shipno) {
		this.shipno = shipno;
	}

	public LocalTime getSkd() {
		return skd;
	}

	public void setSkd(LocalTime skd) {
		this.skd = skd;
	}

	public LocalTime getEtd() {
		return etd;
	}

	public void setEtd(LocalTime etd) {
		this.etd = etd;
	}

	public LocalTime getDelayout() {
		return delayout;
	}

	public void setDelayout(LocalTime delayout) {
		this.delayout = delayout;
	}

	public LocalTime getSka() {
		return ska;
	}

	public void setSka(LocalTime ska) {
		this.ska = ska;
	}

	public LocalTime getEta() {
		return eta;
	}

	public void setEta(LocalTime eta) {
		this.eta = eta;
	}

	public LocalTime getDelayin() {
		return delayin;
	}

	public void setDelayin(LocalTime delayin) {
		this.delayin = delayin;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public long getGateno() {
		return gateno;
	}

	public void setGateno(long gateno) {
		this.gateno = gateno;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	@Override
	public String toString() {
		return "Flight [flightno=" + flightno + ", stationName=" + stationName + ", date=" + date + ", time=" + time
				+ ", shipno=" + shipno + ", skd=" + skd + ", etd=" + etd + ", delayout=" + delayout + ", ska=" + ska
				+ ", eta=" + eta + ", delayin=" + delayin + ", to=" + to + ", from=" + from + ", gateno=" + gateno
				+ ", flag=" + flag + "]";
	}
	
	
}
