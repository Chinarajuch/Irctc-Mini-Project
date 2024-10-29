package com.irctc.mini.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Passenger {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer passengerId;
	private String passengerName;
	private String PassengerSource;
	private String destination;
	private String trainNo;
	private LocalDate journeyDate;
	public Integer getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(Integer passengerId) {
		this.passengerId = passengerId;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public String getPassengerSource() {
		return PassengerSource;
	}
	public void setPassengerSource(String passengerSource) {
		PassengerSource = passengerSource;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(String trainNo) {
		this.trainNo = trainNo;
	}
	public LocalDate getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(LocalDate journeyDate) {
		this.journeyDate = journeyDate;
	}
	@Override
	public String toString() {
		return "Passenger [passengerId=" + passengerId + ", passengerName=" + passengerName + ", PassengerSource="
				+ PassengerSource + ", destination=" + destination + ", trainNo=" + trainNo + ", journeyDate="
				+ journeyDate + "]";
	}
	
	

}
