package com.example.edsolabstest.service.review;

import com.example.edsolabstest.model.CustomerReview;
import com.example.edsolabstest.repository.CustomerReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerReviewServiceImp implements CustomerReviewService{
    @Autowired
    private CustomerReviewRepository customerReviewRepository;

    @Override
    public List<CustomerReview> findAll() {
        return customerReviewRepository.findAll();
    }

    @Override
    public CustomerReview findById(Long id) {
        return customerReviewRepository.findById(id).get();
    }

    @Override
    public CustomerReview save(CustomerReview customerReview) {
        return customerReviewRepository.save(customerReview);
    }

    @Override
    public void remove(Long id) {
            customerReviewRepository.deleteById(id);
    }
}
