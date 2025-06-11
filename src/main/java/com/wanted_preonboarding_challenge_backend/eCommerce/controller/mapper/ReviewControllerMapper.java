package com.wanted_preonboarding_challenge_backend.eCommerce.controller.mapper;


import com.wanted_preonboarding_challenge_backend.eCommerce.controller.dto.ReviewCreateRequest;
import com.wanted_preonboarding_challenge_backend.eCommerce.controller.dto.ReviewUpdateRequest;
import com.wanted_preonboarding_challenge_backend.eCommerce.service.dto.ReviewDto;
import org.springframework.stereotype.Component;

@Component
public class ReviewControllerMapper {

    public ReviewDto.CreateRequest toReviewDtoCreateRequest(ReviewCreateRequest request) {
        return ReviewDto.CreateRequest.builder()
                .rating(request.getRating())
                .title(request.getTitle())
                .content(request.getContent())
                .build();
    }

    public ReviewDto.UpdateRequest toReviewDtoUpdateRequest(ReviewUpdateRequest request) {
        return ReviewDto.UpdateRequest.builder()
                .rating(request.getRating())
                .content(request.getContent())
                .build();
    }

}