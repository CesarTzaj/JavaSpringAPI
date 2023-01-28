
package com.Maket.Market.domain.repository;

import com.Maket.Market.domain.PurchaseDTO;
import com.Maket.Market.domain.PurchaseItemDTO;
import java.util.List;
import java.util.Optional;

public interface PurchaseRespositoryDTO {
    List<PurchaseDTO> getAll();
    Optional<List<PurchaseDTO>> getByCustomerId(String customerId);
    PurchaseDTO save(PurchaseDTO purchaseDTO);    
}
