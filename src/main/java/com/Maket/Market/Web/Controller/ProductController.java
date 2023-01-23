
package com.Maket.Market.web.Controller;

import com.Maket.Market.domain.ProductDTO;
import com.Maket.Market.domain.service.ProductService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
    @GetMapping("/pruesba")
    public String a(){
        return "asf";
    }
    @Autowired
    private ProductService productService;
    
    @GetMapping("/prueba")
    public List<ProductDTO> getAll() {
        return productService.getAll();
    }
    
    @GetMapping("/{id}")
    public Optional<ProductDTO> getProduct(@PathVariable("id") int productId) {
        return productService.getProduct(productId);
    }
    
    @GetMapping("/category/{id}")
    public Optional<List<ProductDTO>> getByCategory(@PathVariable("id") int categoryId){
    return productService.getByCategory(categoryId);
    }
    
    @PostMapping("/save")
    public ProductDTO save(@RequestBody ProductDTO productDTO){
    return productService.save(productDTO);
    }
 
    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int productId){
    return productService.delete(productId);
    }
}
