
package com.Maket.Market.persistance.mapper;

import com.Maket.Market.domain.ProductDTO;
import com.Maket.Market.persistance.entity.Product;
import java.util.List;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {CategoryMapper.class})

public interface ProductMapper {
    @Mappings({
        @Mapping(source = "productId", target = "productIdDTO"),
        @Mapping(source = "name", target = "nameDTO"),
        @Mapping(source = "domainCategoryId", target = "categoryIdDTO"),
        @Mapping(source = "price", target = "priceDTO"),
        @Mapping(source = "stockAvailable", target = "stockAvailableDTO"),
        @Mapping(source = "status", target = "statusDTO"),
        @Mapping(source = "category", target = "categoryDTO"),
    })
    ProductDTO toProductDTO(Product product);    
    List<ProductDTO> toProductDTOs(List<Product> product);
    
    @InheritInverseConfiguration
    @Mapping(target = "barcode", ignore = true)
    Product toProduct(ProductDTO domainProduct);
}
