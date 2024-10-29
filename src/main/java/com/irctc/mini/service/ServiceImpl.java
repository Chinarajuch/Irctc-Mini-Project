package com.irctc.mini.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irctc.mini.entities.Passenger;
import com.irctc.mini.entities.Ticket;
import com.irctc.mini.model.PassengerModel;
import com.irctc.mini.model.TicketModel;
import com.irctc.mini.repo.PassengerRepo;
import com.irctc.mini.repo.TicketRepo;



@Service
public class ServiceImpl implements IrctcService{
	
	PassengerRepo passRepo;
	TicketRepo ticketRepo;
	
	
	@Autowired
	public ServiceImpl(PassengerRepo passRepo, TicketRepo ticketRepo) {
		this.passRepo = passRepo;
		this.ticketRepo = ticketRepo;
	}

	@Override
	public TicketModel bookTicket(PassengerModel passengerModel) {
		
		Ticket t=new Ticket();
		String pnr="";
		String seatNo="S";
		for(int i=1;i<=10;i++) {
			pnr=pnr+(int)(Math.random()*10);
			if(i==1)
				seatNo=seatNo+(int)(Math.random()*10);
		}
		
		t.setPnr(pnr);
		t.setSeatNo(seatNo);
		t.setTicketStatus("confirmed");
		BeanUtils.copyProperties(passengerModel, t);
		ticketRepo.save(t);
		Passenger pass=new Passenger();
		BeanUtils.copyProperties(passengerModel, pass);
		passRepo.save(pass);
		
		TicketModel tm=new TicketModel();
		BeanUtils.copyProperties(t, tm);
		
		return tm;
	}

	@Override
	public TicketModel getByTicketId(int ticketId) {
		Optional<Ticket> byId = ticketRepo.findById(ticketId);
		TicketModel tm=new TicketModel();
		if(byId.isPresent()) {
			BeanUtils.copyProperties(byId.get(), tm);
		return tm;
		}
		
		return tm;
	}

	@Override
	public String cancelTicketById(int id) {
		Optional<Ticket> byId = ticketRepo.findById(id);
		if(byId.isPresent()) {
			ticketRepo.deleteById(id);
		return "your Ticket Cancelled";
		}
		return "I am unable to cancel bcoz you don't booked any ticket with this id";
	}

	@Override
	public TicketModel updateTicketDetailsById(PassengerModel passengerModel, int id) {
		Optional<Ticket> byId = ticketRepo.findById(id);
		TicketModel tm=new TicketModel();
		if(byId.isPresent()) 
		{
				Ticket ticket = byId.get();
				if(passengerModel.getDestination()!=null)
					ticket.setDestination(passengerModel.getDestination());
				if(passengerModel.getJourneyDate()!=null)
					ticket.setJourneyDate(passengerModel.getJourneyDate());
				if(passengerModel.getPassengerName()!=null)
					ticket.setPassengerName(passengerModel.getPassengerName());
				if(passengerModel.getPassengerSource()!=null)
					ticket.setPassengerSource(passengerModel.getPassengerSource());
				if(passengerModel.getTrainNo()!=null)
					ticket.setTrainNo(passengerModel.getTrainNo());
				ticketRepo.save(ticket);
				BeanUtils.copyProperties(ticket,tm);
				Optional<Passenger> byId2 = passRepo.findById(id);
				if(byId2.isPresent())
				{
					Passenger passenger = byId2.get();
					if(passengerModel.getDestination()!=null)
						passenger.setDestination(passengerModel.getDestination());
					if(passengerModel.getJourneyDate()!=null)
						passenger.setJourneyDate(passengerModel.getJourneyDate());
					if(passengerModel.getPassengerName()!=null)
						passenger.setPassengerName(passengerModel.getPassengerName());
					if(passengerModel.getPassengerSource()!=null)
						passenger.setPassengerSource(passengerModel.getPassengerSource());
					if(passengerModel.getTrainNo()!=null)
						passenger.setTrainNo(passengerModel.getTrainNo());
					
					passRepo.save(passenger);
				}
				
			return tm;
		}
		return tm;
	}

	@Override
	public List<TicketModel> getAllTickets() {
		List<Ticket> all = ticketRepo.findAll();
		List<TicketModel> modelList=new ArrayList<>();
		for(Ticket t:all)
		{
			TicketModel tm=new TicketModel();
			BeanUtils.copyProperties(t, tm);
			modelList.add(tm);
		}
		return modelList;
	}

	@Override
	public Boolean deleteAllTickets() {
		List<Ticket> all = ticketRepo.findAll();
		for(Ticket t:all)
		{
			ticketRepo.deleteAll();
			passRepo.deleteAll();
		}
		return true;
	}

	@Override
	public TicketModel bookingStatusByPnr(String pnr) {
		Optional<Ticket> byPnr = ticketRepo.findByPnr(pnr);
		TicketModel tm=new TicketModel();
		if(byPnr.isPresent()) {
			Ticket ticket = byPnr.get();
			BeanUtils.copyProperties(ticket,tm);
			return tm;
		}
		return tm;
	}

}
