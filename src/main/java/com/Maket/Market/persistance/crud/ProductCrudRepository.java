package com.Maket.Market.persistance.crud;

import com.Maket.Market.domain.ProductDTO;
import com.Maket.Market.persistance.entity.Product;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;


public interface ProductCrudRepository extends CrudRepository<Product, Integer>{
    //@Query(value = "SELECT * FROM products WHERE category_id =?", nativeQuery = true) native query sql
    //List<Product> findByCategoryId(int categoryId); //cuando se usa query nativo podemos nombrar como nosotros queremos findByIDCategory
    List<Product> findByCategoryIdOrderByNameAsc(int categoryId); //cuando se usa query methods se debe usar camel case example findByCategoryID el metodo+como se busca en la base de datos
    // https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods
    Optional<List<Product>> findByStockAvailableLessThanAndStatus(int stockAvailable, boolean status);

    //public Optional<ProductDTO> findById( int a);
}
