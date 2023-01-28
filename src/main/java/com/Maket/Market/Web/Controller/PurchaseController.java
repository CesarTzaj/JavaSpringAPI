
package com.Maket.Market.web.Controller;

import com.Maket.Market.domain.PurchaseDTO;
import com.Maket.Market.domain.PurchaseItemDTO;
import com.Maket.Market.domain.service.PurchaseService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {
    
    @Autowired
    private PurchaseService purchaseService;
    
    @GetMapping("/all")
    public ResponseEntity<List<PurchaseDTO>> getAll(){
    return new ResponseEntity<>(purchaseService.getAll(), HttpStatus.OK);
    }
    
    
    @GetMapping("/customer/{id}")
    public ResponseEntity<List<PurchaseDTO>> findByCustomerId(@PathVariable("id") String customerId){
        return purchaseService.findByCustomerId(customerId)
                .map(purchase -> new ResponseEntity<>(purchase, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    
}
