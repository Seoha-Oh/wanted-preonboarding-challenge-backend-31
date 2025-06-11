package com.wanted_preonboarding_challenge_backend.eCommerce.domain;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "product_option")
@Getter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class ProductOption {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "option_group_id", nullable = false)
    private ProductOptionGroup optionGroup;

    @Column(nullable = false)
    private String name;

    @Column(name = "additional_price", precision = 19, scale = 2)
    private BigDecimal additionalPrice;

    @Column(nullable = false, unique = true)
    private String sku;

    @Column(nullable = false)
    private Integer stock;

    @Column(name = "display_order", nullable = false)
    private Integer displayOrder;

    @OneToMany(mappedBy = "option", cascade = CascadeType.ALL, orphanRemoval = true)
    @Builder.Default
    private List<ProductImage> images = new ArrayList<>();


    public void updateProductOption(String name, BigDecimal additionalPrice, String sku, Integer stock, Integer displayOrder){
        this.name = name;
        this.additionalPrice = additionalPrice;
        this.sku = sku;
        this.stock = stock;
        this.displayOrder = displayOrder;
    }

    public void changeOptionGroup(ProductOptionGroup optionGroup) {
        this.optionGroup = optionGroup;
    }


    public void changeName(String name) {
        this.name = name;
    }

    public void changeAdditionalPrice(BigDecimal additionalPrice) {
        this.additionalPrice = additionalPrice;
    }

    public void changeSku(String sku) {
        this.sku = sku;
    }

    public void changeStock(Integer stock) {
        this.stock = stock;
    }

    public void changeDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

}