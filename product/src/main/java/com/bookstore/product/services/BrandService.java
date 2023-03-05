package com.bookstore.product.services;

import com.bookstore.product.entity.Brand;
import com.bookstore.product.viewmodel.BrandPostVm;
import com.bookstore.product.viewmodel.BrandVm;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

public interface BrandService {
    List<BrandVm> getAllBrand(int pageNo);

    List<BrandVm> getAllActiveBrand(int pageNo);

    BrandVm getBrandById(Long brandId);

    ResponseEntity<?> updateBrand(Long brandId, BrandPostVm brand);

    ResponseEntity<?> activeBrand(Long brandId);

    ResponseEntity<?> disActiveBrand(Long brandId);

    ResponseEntity<?> createNewBrand(BrandPostVm brand);
}
