package com.Maket.Market.web.Controller;

import com.Maket.Market.domain.CustomerDTO;
import com.Maket.Market.domain.service.CustomerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/all")
    public ResponseEntity<List<CustomerDTO>> getall() {
        return new ResponseEntity<>(customerService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerDTO> findByCustomerId(@PathVariable("id") int customerId) {
        return (ResponseEntity<CustomerDTO>) customerService.findByCustomerId(customerId)
                .map(customer -> {
                    if (customer.equals("")) {
                        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
                    } else {
                        return new ResponseEntity<>(customer, HttpStatus.OK);
                    }
                })
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    
    @PostMapping("/save")
    public ResponseEntity<CustomerDTO> save(@RequestBody CustomerDTO customerDTO){
        return new ResponseEntity<>(customerService.save(customerDTO), HttpStatus.OK);        
    }
    
    @DeleteMapping("delete/{id}")
    public ResponseEntity delete(@PathVariable("id") int customerId){
        if(customerService.delate(customerId)){
        return new ResponseEntity(HttpStatus.OK);
        }else{
        return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        
        
    }
}

