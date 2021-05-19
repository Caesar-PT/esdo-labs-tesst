package com.example.edsolabstest.model;

import javax.persistence.*;

@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private CustomerReview customerReview;

    private String reply;

    private boolean status;

    private Long timeProcessing;

    public Ticket() {
    }

    public Ticket(Long id, CustomerReview customerReview, String reply, boolean status, Long timeProcessing) {
        this.id = id;
        this.customerReview = customerReview;
        this.reply = reply;
        this.status = status;
        this.timeProcessing = timeProcessing;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CustomerReview getCustomerReview() {
        return customerReview;
    }

    public void setCustomerReview(CustomerReview customerReview) {
        this.customerReview = customerReview;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Long getTimeProcessing() {
        return timeProcessing;
    }

    public void setTimeProcessing(Long timeProcessing) {
        this.timeProcessing = timeProcessing;
    }
}
