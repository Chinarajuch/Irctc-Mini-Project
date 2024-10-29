package com.irctc.mini.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class PassengerModel {
	
	private String passengerName;
	private String passengerSource;
	private String destination;
	private String trainNo;
	@JsonFormat(pattern="dd/MM/yyyy")
	private LocalDate journeyDate;
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public String getPassengerSource() {
		return passengerSource;
	}
	public void setPassengerSource(String passengerSource) {
		this.passengerSource = passengerSource;
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
		return "PassengerModel [passengerName=" + passengerName + ", passengerSource=" + passengerSource
				+ ", destination=" + destination + ", trainNo=" + trainNo + ", journeyDate=" + journeyDate + "]";
	}
	

}
