package com.Maket.Market.persistance.mapper;

import com.Maket.Market.domain.PurchaseDTO;
import com.Maket.Market.persistance.entity.Purchase;
import java.util.List;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {PurchaseItemMapper.class})
public interface PurchaseMapper {

    @Mappings({
        @Mapping(source = "purchaseId", target = "purchaseIdDTO"),
        @Mapping(source = "customerId", target = "customerIdDTO"),
        @Mapping(source = "date", target = "dateDTO"),
        @Mapping(source = "paymentMethod", target = "paymentMethodDTO"),
        @Mapping(source = "comments", target = "commentDTO"),
        @Mapping(source = "status", target = "statusDTO"),
        @Mapping(source = "products", target = "purchaseItemDTO")
    })
    PurchaseDTO toPurchaseDTO(Purchase purchase);

    List<PurchaseDTO> toPurchaseDTOS(List<Purchase> purchases);

    @InheritInverseConfiguration
    @Mapping(target = "customer", ignore = true)
    Purchase toPurchase(PurchaseDTO purchaseDTO);
}
