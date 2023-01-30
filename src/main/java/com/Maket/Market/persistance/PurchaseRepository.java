
package com.Maket.Market.persistance;

import com.Maket.Market.domain.PurchaseDTO;
import com.Maket.Market.domain.PurchaseItemDTO;
import com.Maket.Market.domain.repository.PurchaseRespositoryDTO;
import com.Maket.Market.persistance.crud.PurchaseCrudRepository;
import com.Maket.Market.persistance.crud.PurchaseItemCruedRepository;
import com.Maket.Market.persistance.entity.Purchase;
import com.Maket.Market.persistance.entity.PurchasesProduct;
import com.Maket.Market.persistance.mapper.PurchaseItemMapper;
import com.Maket.Market.persistance.mapper.PurchaseMapper;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PurchaseRepository implements PurchaseRespositoryDTO{
 
    @Autowired
    //private PurchaseItemCruedRepository purchaseCrudRepository;
    private PurchaseCrudRepository purchaseCrudRepository;
    
    @Autowired
    private PurchaseMapper mapper;

    @Override
    public List<PurchaseDTO> getAll() {
        return mapper.toPurchaseDTOS((List<Purchase>) purchaseCrudRepository.findAll());
    }

    @Override
    public Optional<List<PurchaseDTO>> getByCustomerId(int customerId) {
        return purchaseCrudRepository.findByCustomerId(customerId)
                .map(purchase -> mapper.toPurchaseDTOS(purchase));              
    }

    @Override
    public PurchaseDTO save(PurchaseDTO purchaseDTO) {        
        Purchase purchase = mapper.toPurchase(purchaseDTO);
        purchase.getProducts().forEach(product -> product.setPurchase(purchase));

        return mapper.toPurchaseDTO(purchaseCrudRepository.save(purchase));
    }
   
}
