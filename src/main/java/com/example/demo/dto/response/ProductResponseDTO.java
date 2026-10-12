package com.example.demo.dto.response;

import com.example.demo.entity.ProductEntity;
import java.math.BigDecimal;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductResponseDTO {
    Long id;
    String name;
    BigDecimal sellPrice;

    public static ProductResponseDTO fromEntity(ProductEntity entity) {
        if (entity == null) {
            return null;
        }
        return ProductResponseDTO.builder()
                .id(entity.getId())
                .name(entity.getName())
                .sellPrice(entity.getSellPrice())
                .build();
    }
}