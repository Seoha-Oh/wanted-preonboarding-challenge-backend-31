package com.wanted_preonboarding_challenge_backend.eCommerce.service.product.command;

import com.wanted_preonboarding_challenge_backend.eCommerce.controller.dto.ProductListResponse;
import com.wanted_preonboarding_challenge_backend.eCommerce.service.product.dto.ProductDto;

public interface ProductQueryHandler {
    // 상품 조회
    ProductDto.Product getProduct(ProductQuery.GetProduct query);

    ProductListResponse getProducts(ProductQuery.ListProducts query);
}
