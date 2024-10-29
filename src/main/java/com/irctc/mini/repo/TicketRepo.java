package com.irctc.mini.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.irctc.mini.entities.Ticket;

@Repository
public interface TicketRepo extends JpaRepository<Ticket,Integer> {

	public Optional<Ticket> findByPnr(String pnr);

}
