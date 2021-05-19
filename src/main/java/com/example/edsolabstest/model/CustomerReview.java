package com.example.edsolabstest.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class CustomerReview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Department department;

    private String phone;
    private String review;
    private Date timeReception;

    public CustomerReview() {
    }

    public CustomerReview(Long id, Department department, String phone, String review, Date timeReception) {
        this.id = id;
        this.department = department;
        this.phone = phone;
        this.review = review;
        this.timeReception = timeReception;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public Date getTimeReception() {
        return timeReception;
    }

    public void setTimeReception(Date timeReception) {
        this.timeReception = timeReception;
    }
}
