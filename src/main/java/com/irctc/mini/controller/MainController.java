package com.irctc.mini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.irctc.mini.model.PassengerModel;
import com.irctc.mini.model.TicketModel;
import com.irctc.mini.service.ServiceImpl;

@RestController
@RequestMapping("irctc")
public class MainController {

	private ServiceImpl serImpl;
	
	@Autowired
	public MainController(ServiceImpl serImpl) {
		this.serImpl = serImpl;
	}

	@PostMapping("/bookTicket")
	public ResponseEntity<TicketModel> bookTicket(@RequestBody PassengerModel pm)
	{
		return new ResponseEntity<>(serImpl.bookTicket(pm),HttpStatus.CREATED);
	}
	@GetMapping("/ticket/id/{ticketId}")
	public ResponseEntity<TicketModel> getByTicketId(@PathVariable int ticketId)
	{
		return new ResponseEntity<>(serImpl.getByTicketId(ticketId),HttpStatus.FOUND);
	}
	@DeleteMapping("/ticket/delete/id/{id}")
	public ResponseEntity<String> cancelTicketById(@PathVariable int id)
	{
		return new ResponseEntity<>(serImpl.cancelTicketById(id),HttpStatus.MOVED_PERMANENTLY);
	}
	@PutMapping("/ticket/update/id/{id}")
	public ResponseEntity<TicketModel> updateTicketDetailsById(@RequestBody PassengerModel passengerModel,@PathVariable int id) {
		return new ResponseEntity<>(serImpl.updateTicketDetailsById(passengerModel, id),HttpStatus.CREATED);
	}
	@GetMapping("ticket/allTickets")
	public ResponseEntity<List<TicketModel>> getAllTickets(){
		return new ResponseEntity<>(serImpl.getAllTickets(),HttpStatus.OK);
	}
	@DeleteMapping("/ticket/deleteAllTickets")
	public ResponseEntity<Boolean> deleteAllTickets() {
		return new ResponseEntity<>(serImpl.deleteAllTickets(),HttpStatus.MOVED_PERMANENTLY);
	}
	@GetMapping("ticket/pnr/{pnr}")
	public ResponseEntity<TicketModel> bookingStatusByPnr(@PathVariable String pnr) {
		return new ResponseEntity<>(serImpl.bookingStatusByPnr(pnr),HttpStatus.FOUND);
	}
	
}
