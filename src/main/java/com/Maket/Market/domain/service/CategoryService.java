package com.Maket.Market.domain.service;

import com.Maket.Market.domain.CategoryDTO;
import com.Maket.Market.domain.repository.CategoryRepositoryDTO;
import com.Maket.Market.persistance.CategoryRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    
    @Autowired
    private CategoryRepositoryDTO  categoryRepositoryDTO;
    
    public List<CategoryDTO> getAll(){
    return categoryRepositoryDTO.getAll();
    }
    
    public Optional<CategoryDTO> getByCategoryId(int CategoryId){
      return categoryRepositoryDTO.getByCategoryId(CategoryId);
    }
    
    public CategoryDTO save(CategoryDTO categoryDTO){
        return categoryRepositoryDTO.save(categoryDTO);
    }
    
    public Boolean delete(int categoryId){    
        return getByCategoryId(categoryId)
             .map(category -> {
             categoryRepositoryDTO.delete(categoryId);
             return true;
             }).orElse( false);
             
    }
    
}
