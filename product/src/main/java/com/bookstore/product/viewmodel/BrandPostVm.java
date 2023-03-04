package com.bookstore.product.viewmodel;

import jakarta.validation.constraints.NotNull;
import java.util.List;

public record BrandPostVm (@NotNull String name, String slug, List<Long> productIds) {
}
