package com.example.edsolabstest.controller;

import com.example.edsolabstest.service.ticket.TicketServiceImp;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ticket")
public class TicketController {
    private TicketServiceImp ticketServiceImp;


}
