package com.Maket.Market.persistance.crud;

import com.Maket.Market.persistance.entity.PurchasesProduct;
import org.springframework.data.repository.CrudRepository;




public interface PurchaseItemCruedRepository extends CrudRepository<PurchasesProduct, Integer>{
    
}
