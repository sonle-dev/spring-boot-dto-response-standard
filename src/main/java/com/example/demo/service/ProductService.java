package com.example.demo.service;

import com.example.demo.dto.response.ProductResponseDTO;
import com.example.demo.entity.ProductEntity;
import java.math.BigDecimal;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    public ProductResponseDTO getProductById(Long id) {
        // Giả lập entity lấy từ Database với đầy đủ thông tin nội bộ
        ProductEntity mockProduct = ProductEntity.builder()
                .id(id)
                .name("Bàn phím cơ không dây")
                .sku("KB-MECH-001")
                .importPrice(new BigDecimal("800000"))   // Giá nhập bảo mật
                .sellPrice(new BigDecimal("1450000"))
                .stockQuantity(120)                      // Tồn kho nội bộ
                .build();

        // Chuyển đổi sang DTO trước khi gửi ra Controller
        return ProductResponseDTO.fromEntity(mockProduct);
    }
}