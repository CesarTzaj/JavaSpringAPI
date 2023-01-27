package com.Maket.Market.domain.service;

import com.Maket.Market.domain.CustomerDTO;
import com.Maket.Market.persistance.CustomerRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    
    public List<CustomerDTO> getAll(){
        return customerRepository.getAll();
    }
    
    public Optional<CustomerDTO> findByCustomerId(int customerid){
        return customerRepository.getByCustomerId(customerid);
    }
    
    public CustomerDTO save(CustomerDTO customerDTO){
    return  customerRepository.save(customerDTO);       
    }
    
    public Boolean delate(int customerId){
        return findByCustomerId(customerId)
                .map(customer-> {
                customerRepository.Delete(customerId);
                return true; })
                .orElse(false);
        
    }
}
