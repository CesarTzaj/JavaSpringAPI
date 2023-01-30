
package com.Maket.Market.persistance.crud;

import com.Maket.Market.persistance.entity.Purchase;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;


public interface PurchaseCrudRepository extends CrudRepository<Purchase, Integer>{
    Optional<List<Purchase>> findByCustomerId(int customerId);
}
