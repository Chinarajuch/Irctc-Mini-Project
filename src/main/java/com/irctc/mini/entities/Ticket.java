package com.irctc.mini.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Ticket {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer ticketId;
	private String passengerName;
	private String PassengerSource;
	private String destination;
	private String trainNo;
	private String pnr;
	private String ticketStatus;
	private LocalDate journeyDate;
	private String seatNo;
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
		return PassengerSource;
	}
	public void setPassengerSource(String PassengerSource) {
		this.PassengerSource = PassengerSource;
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
		return "Ticket [ticketId=" + ticketId + ", passName=" + passengerName + ", source=" + PassengerSource + ", destination="
				+ destination + ", trainNo=" + trainNo +", seatNo=" + seatNo +", pnr=" + pnr + ", ticketStatus=" + ticketStatus
				+ ", journeyDate=" + journeyDate + "]";
	}
	public String getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}
	

}
