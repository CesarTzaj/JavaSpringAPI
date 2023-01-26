package com.Maket.Market.domain.service;

import com.Maket.Market.domain.ProductDTO;
import com.Maket.Market.domain.repository.ProductRepositoryDTO;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
//or @Component pero se recomienda usar service por semantica
public class ProductService {
   @Autowired
    private ProductRepositoryDTO productRepositoryDTO;
    
    public List<ProductDTO> getAll(){
        return productRepositoryDTO.getAll();
    }
    
    public Optional<ProductDTO> getProduct(int productId){
        return productRepositoryDTO.getProduct(productId);
    }
    
    public Optional<List<ProductDTO>> getByCategory(int categoryID){
        return productRepositoryDTO.getByCategory(categoryID);
    }
    
    public ProductDTO save(ProductDTO productDTO){
        return productRepositoryDTO.save(productDTO);
    }
    
    public Boolean delete(int productId){
       // Esta es la forma recomendada de crearlo. 
        return getProduct(productId).map(product ->{
            productRepositoryDTO.delete(productId);
           return true;
       }).orElse(false);
     
     //otra forma para que nos devuelva un boolean 
    // if(getProduct(productId).isPresent()){
     //productRepositoryDTO.delete(productId);
     //return true;
     //}else{
     //return false;
     //}
    } 
    public Optional<List<ProductDTO>> getLowProduct(int quantity){
        return productRepositoryDTO.getLowProduct(quantity);
    }
}
