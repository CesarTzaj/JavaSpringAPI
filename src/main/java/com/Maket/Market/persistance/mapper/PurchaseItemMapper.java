package com.Maket.Market.persistance.mapper;

import com.Maket.Market.domain.PurchaseItemDTO;
import com.Maket.Market.persistance.entity.PurchasesProduct;
import java.util.List;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {ProductMapper.class})
public interface PurchaseItemMapper {
    
    @Mappings({
        @Mapping(source = "id.productId", target = "productIdDTO"),
        @Mapping(source = "quantity", target = "quantityDTO"),
        @Mapping(source = "total", target = "totalDTO"),
        @Mapping(source = "status", target = "activeDTO")
    })
    PurchaseItemDTO toPurchaseItemDTO(PurchasesProduct purchasesProduct);
    List<PurchaseItemDTO> toPurchaseItemDTOS(List<PurchasesProduct> purchasesProduct);
    
    @InheritInverseConfiguration
    @Mappings({
        @Mapping(target = "purchase", ignore = true),
        @Mapping(target = "product", ignore = true),
        @Mapping(target = "id.purchaseId", ignore = true),
    })
    PurchasesProduct toPurchasesProduct(PurchaseItemDTO purchaseItemDTO);

}
