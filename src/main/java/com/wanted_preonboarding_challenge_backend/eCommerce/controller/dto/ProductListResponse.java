package com.wanted_preonboarding_challenge_backend.eCommerce.controller.dto;


import com.wanted_preonboarding_challenge_backend.eCommerce.service.dto.PaginationDto;
import com.wanted_preonboarding_challenge_backend.eCommerce.service.product.dto.ProductDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductListResponse {
    private List<ProductDto.ProductSummary> items;
    private PaginationDto.PaginationInfo pagination;
}