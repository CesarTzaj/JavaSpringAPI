package com.Maket.Market.domain.repository;

import com.Maket.Market.domain.CategoryDTO;
import java.util.List;
import java.util.Optional;

public interface CategoryRepositoryDTO {

    List<CategoryDTO> getAll();

    Optional<CategoryDTO> getByCategoryId(int CategoryId);       

    CategoryDTO save(CategoryDTO categoryDTO);

    void delete(int categoryId);

}
