package com.Maket.Market.persistance.crud;

import com.Maket.Market.domain.CustomerDTO;
import com.Maket.Market.persistance.entity.Customer;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

public interface CustomerCrudRepository extends CrudRepository<Customer, Integer>{
    
    Optional<List<CustomerDTO>> findByCustomerId(int customerId);
}
