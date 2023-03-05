package com.bookstore.product.viewmodel;

import com.bookstore.product.entity.Brand;
import jakarta.validation.constraints.NotNull;
import java.util.List;

public record BrandPostVm (@NotNull String name, String slug) {
    public Brand toModel() {
        return new Brand(this.name, this.slug);
    }

}
