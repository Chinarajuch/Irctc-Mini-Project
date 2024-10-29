package com.irctc.mini.model;

import java.time.LocalDate;

public class TicketModel {
	private Integer ticketId;
	private String passengerName;
	private String passengerSource;
	private String destination;
	private String trainNo;
	private String pnr;
	private String ticketStatus;
	private String seatNo;
	private LocalDate journeyDate;
	public Integer getTicketId() {
		return ticketId;
	}
	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}
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
	public String getPnr() {
		return pnr;
	}
	public void setPnr(String pnr) {
		this.pnr = pnr;
	}
	public String getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	public LocalDate getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(LocalDate journeyDate) {
		this.journeyDate = journeyDate;
	}
	@Override
	public String toString() {
		return "TicketModel [ticketId=" + ticketId + ", passengerName=" + passengerName + ", passengerSource=" + passengerSource + ", destination="
				+ destination + ", trainNo=" + trainNo + ", pnr=" + pnr +", seatNo=" + seatNo + ", ticketStatus=" + ticketStatus
				+ ", journeyDate=" + journeyDate + "]";
	}
	public String getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}

}
