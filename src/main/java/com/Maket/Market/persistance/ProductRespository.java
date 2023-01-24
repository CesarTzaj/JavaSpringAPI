package com.Maket.Market.persistance;

import com.Maket.Market.domain.ProductDTO;
import com.Maket.Market.domain.repository.ProductRepositoryDTO;
import com.Maket.Market.persistance.crud.ProductCrudRepository;
import com.Maket.Market.persistance.entity.Product;
import com.Maket.Market.persistance.mapper.ProductMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository // le indicamos a la clase que es la encarga de interactuar con la base de datos.
//@Component // le indicamos que es un componente de spring.El primero es mejor porque indicamos el tipo de componente que es.@Component
public class ProductRespository implements ProductRepositoryDTO{
    @Autowired
    private ProductCrudRepository productCrudRepository;
    @Autowired 
    private ProductMapper productMapper;
    
    @Override
    public List<ProductDTO> getAll(){
        List<Product> products = (List<Product>) productCrudRepository.findAll();
    return productMapper.toProductDTOs(products);
    }
    
    @Override
    public Optional<List<ProductDTO>> getByCategory(int CategoryId){
        List<Product> products = productCrudRepository.findByCategoryIdOrderByNameAsc(CategoryId);
        return Optional.of(productMapper.toProductDTOs(products));
    }

    @Override
    public Optional<List<ProductDTO>> getLowProduct(int quantity) {
        Optional<List<Product>> products = productCrudRepository.findByStockAvailableLessThanAndStatus(quantity, true);
        return products.map(prods -> productMapper.toProductDTOs(prods));
    }
    
    @Override
    public Optional<ProductDTO> getProduct(int productId){
        return productCrudRepository.findById(productId).map(product -> productMapper.toProductDTO((product)));
    }

    @Override
    public ProductDTO save(ProductDTO productDTO) {
        Product product = productMapper.toProduct(productDTO);
        return productMapper.toProductDTO(productCrudRepository.save(product));
    }
    @Override
    public void delete(int productId){
    productCrudRepository.deleteById(productId);
    }
}
