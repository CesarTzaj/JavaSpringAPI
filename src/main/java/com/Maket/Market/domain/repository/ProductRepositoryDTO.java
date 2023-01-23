package com.Maket.Market.domain.repository;

import com.Maket.Market.domain.ProductDTO;
import java.util.List;
import java.util.Optional;

public interface ProductRepositoryDTO {
    List<ProductDTO> getAll();
    Optional<List<ProductDTO>> getByCategory(int CategoryId);
    Optional<List<ProductDTO>> getLowProduct(int quantity);
    Optional<ProductDTO> getProduct(int productId);
    ProductDTO save(ProductDTO product);
    void delete(int productId);
}
