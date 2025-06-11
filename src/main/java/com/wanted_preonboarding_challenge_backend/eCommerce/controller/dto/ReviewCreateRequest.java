package com.wanted_preonboarding_challenge_backend.eCommerce.controller.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReviewCreateRequest {
    private Integer rating;
    private String title;
    private String content;
}