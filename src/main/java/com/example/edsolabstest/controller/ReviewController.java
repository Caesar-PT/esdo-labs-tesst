package com.example.edsolabstest.controller;

import com.example.edsolabstest.model.CustomerReview;
import com.example.edsolabstest.service.review.CustomerReviewServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/review")
public class ReviewController {
    @Autowired
    private CustomerReviewServiceImp customerReviewServiceImp;

    @GetMapping("/list")
    public ResponseEntity<List<CustomerReview>> showAll(){
        return new ResponseEntity<>(customerReviewServiceImp.findAll(), HttpStatus.OK);
    }

    @GetMapping("/create")
    public ResponseEntity<CustomerReview> createReview(@RequestBody CustomerReview customerReview){
        return new ResponseEntity<>(customerReviewServiceImp.save(customerReview), HttpStatus.OK);
    }
}
