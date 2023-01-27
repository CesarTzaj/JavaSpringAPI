package com.Maket.Market.persistance;

import com.Maket.Market.domain.CustomerDTO;
import com.Maket.Market.domain.repository.CustomerRepositoryDTO;
import com.Maket.Market.persistance.crud.CustomerCrudRepository;
import com.Maket.Market.persistance.entity.Customer;
import com.Maket.Market.persistance.mapper.CustomerMapper;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepository implements CustomerRepositoryDTO{
    
    @Autowired
    CustomerCrudRepository customerCrudRepository;
    @Autowired
    CustomerMapper mapper;

    @Override
    public List<CustomerDTO> getAll() {
        List<Customer> customers = (List<Customer>) customerCrudRepository.findAll();
        return mapper.tocustomerDTOS(customers);
    }

    @Override
    public Optional<CustomerDTO> getByCustomerId(int customerId) {
        return customerCrudRepository.findById(customerId)
                .map(custumer -> mapper.tocustomerDTO(custumer));
    }

    @Override
    public CustomerDTO save(CustomerDTO customerDTO) {
        Customer customer = mapper.toCustomer(customerDTO);
        return mapper.tocustomerDTO(customerCrudRepository.save(customer));
    }

    @Override
    public void Delete(int customerId) {
        customerCrudRepository.deleteById(customerId);
    }
    
    
}
