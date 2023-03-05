package com.bookstore.product.viewmodel;

import com.bookstore.product.entity.Brand;

public record BrandVm (Long id, String name, String slug) {
    public static BrandVm fromModel(Brand brand) {
        return new BrandVm(brand.getId(), brand.getName(), brand.getSlug());
    }

}
