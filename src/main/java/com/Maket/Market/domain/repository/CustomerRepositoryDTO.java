package com.Maket.Market.domain.repository;

import com.Maket.Market.domain.CustomerDTO;
import java.util.List;
import java.util.Optional;

public interface CustomerRepositoryDTO {
    List<CustomerDTO> getAll();
    Optional<CustomerDTO> getByCustomerId(int customerId);
    CustomerDTO save(CustomerDTO customerDTO);
    void Delete(int customerId);
}
