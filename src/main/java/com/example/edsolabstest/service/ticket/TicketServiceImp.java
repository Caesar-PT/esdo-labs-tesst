package com.example.edsolabstest.service.ticket;

import com.example.edsolabstest.model.Ticket;
import com.example.edsolabstest.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TicketServiceImp implements TicketService{
    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public List<Ticket> findAll() {
        return ticketRepository.findAll();
    }

    @Override
    public Ticket findById(Long id) {
        return ticketRepository.findById(id).get();
    }

    @Override
    public Ticket save(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    @Override
    public void remove(Long id) {
        ticketRepository.deleteById(id);
    }
}
