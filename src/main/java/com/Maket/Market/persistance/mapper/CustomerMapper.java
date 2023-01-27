package com.Maket.Market.persistance.mapper;

import com.Maket.Market.domain.CustomerDTO;
import com.Maket.Market.persistance.entity.Customer;
import java.util.List;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface CustomerMapper {
    
    
    @Mapping(source = "lastname", target ="lastName" )
    CustomerDTO tocustomerDTO(Customer customer);
    List<CustomerDTO> tocustomerDTOS(List<Customer> customer);
    
    @InheritInverseConfiguration
    @Mapping(target = "purchases", ignore = true)
    Customer toCustomer(CustomerDTO customerDTO);
    
}
