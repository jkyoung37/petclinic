package org.springframework.samples.petclinic.data.dto;

import org.springframework.samples.petclinic.data.entity.ProductEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ProductDto {

    private String productId;
    private String prodcutName;
    private int productPrice;
    private int productStock;

    public ProductEntity toEntity() {
        return ProductEntity.builder()
                .productId(productId)
                .productName(prodcutName)
                .productPrice(productPrice)
                .productStock(productStock)
                .build();
    }
}
