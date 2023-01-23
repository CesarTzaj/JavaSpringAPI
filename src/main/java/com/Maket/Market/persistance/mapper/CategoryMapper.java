package com.Maket.Market.persistance.mapper;

import com.Maket.Market.domain.CategoryDTO;
import com.Maket.Market.persistance.entity.Category;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    @Mappings({
        @Mapping(source = "categoryId", target = "categoryIdDTO"),
        @Mapping(source = "description", target = "categoryDTO"),
        @Mapping(source = "status", target = "statusDTO"),
    })
    CategoryDTO toDomainCategory(Category category);
    
    @InheritInverseConfiguration
    @Mapping(target = "products", ignore = true)
    Category toCategory(CategoryDTO domainCategory);
}
