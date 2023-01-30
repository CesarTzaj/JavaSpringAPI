package com.Maket.Market.domain.service;

import com.Maket.Market.domain.PurchaseDTO;
import com.Maket.Market.domain.PurchaseItemDTO;
import com.Maket.Market.domain.repository.PurchaseRespositoryDTO;
import com.Maket.Market.persistance.PurchaseRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurchaseService {
    
    @Autowired
    private PurchaseRespositoryDTO purchaseRepository;    
    
    public List<PurchaseDTO> getAll(){
        return purchaseRepository.getAll();
    }
    
    public Optional<List<PurchaseDTO>> findByCustomerId(int customerId){
        return purchaseRepository.getByCustomerId(customerId);
    }
    
    public PurchaseDTO save(PurchaseDTO purchaseDTO){
        return purchaseRepository.save(purchaseDTO);
    }          
    
}
