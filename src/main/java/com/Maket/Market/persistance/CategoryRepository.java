package com.Maket.Market.persistance;

import com.Maket.Market.domain.CategoryDTO;
import com.Maket.Market.domain.repository.CategoryRepositoryDTO;
import com.Maket.Market.persistance.crud.CategoryCrudRepository;
import com.Maket.Market.persistance.entity.Category;
import com.Maket.Market.persistance.mapper.CategoryMapper;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryRepository implements CategoryRepositoryDTO {

    @Autowired
    private CategoryCrudRepository categoryCrudRepository;
    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<CategoryDTO> getAll() {
        List<Category> categories = (List<Category>) categoryCrudRepository.findAll();
        return categoryMapper.toCategoryDTOS(categories);
    }

    @Override
    public Optional<CategoryDTO> getByCategoryId(int CategoryId) {
        return categoryCrudRepository.findByCategoryId(CategoryId)
                .map(category -> categoryMapper.toCategoryDTO(category));

    }

    @Override
    public CategoryDTO save(CategoryDTO categoryDTO) {
        Category category = categoryMapper.toCategory(categoryDTO);
        return categoryMapper.toCategoryDTO(categoryCrudRepository.save(category));
    }

    @Override
    public void delete(int categoryId) {
        categoryCrudRepository.deleteById(categoryId);
    }

}
