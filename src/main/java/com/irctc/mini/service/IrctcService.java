package com.irctc.mini.service;

import java.util.List;

import com.irctc.mini.entities.Ticket;
import com.irctc.mini.model.PassengerModel;
import com.irctc.mini.model.TicketModel;

public interface IrctcService {
	
	
	public TicketModel bookTicket(PassengerModel passengerModel);
	
	public TicketModel getByTicketId(int ticketId);
	
	public String cancelTicketById(int id);
	
	public TicketModel updateTicketDetailsById(PassengerModel passengerModel,int id);
	
	public List<TicketModel> getAllTickets();
	
	public Boolean deleteAllTickets();
	
	public TicketModel bookingStatusByPnr(String pnr);

}
