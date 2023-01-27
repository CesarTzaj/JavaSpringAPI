package com.Maket.Market.persistance.crud;

import com.Maket.Market.persistance.entity.Category;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface CategoryCrudRepository extends CrudRepository<Category, Integer>{
    
    Optional<Category> findByCategoryId(int categoryId);
}
