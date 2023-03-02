package com.bookstore.product.services.impl;

import com.bookstore.product.services.BrandService;
import com.bookstore.product.viewmodel.BrandPostVm;
import com.bookstore.product.viewmodel.BrandVm;
import java.util.List;
import org.springframework.http.ResponseEntity;

public class BrandServiceImpl implements BrandService {
    @Override
    public List<BrandVm> getAllBrand(int pageNo) {
        return null;
    }

    @Override
    public List<BrandVm> getAllActiveBrand(int pageNo) {
        return null;
    }

    @Override
    public BrandVm getBrandById(Long brandId) {
        return null;
    }

    @Override
    public ResponseEntity<?> updateBrand(Long brandId, BrandPostVm brand) {
        return null;
    }

    @Override
    public ResponseEntity<?> activeBrand(Long brandId) {
        return null;
    }

    @Override
    public ResponseEntity<?> disActiveBrand(Long brandId) {
        return null;
    }

    @Override
    public ResponseEntity<?> activeBrands(List<Long> brandIds) {
        return null;
    }

    @Override
    public ResponseEntity<?> disActiveBrands(List<Long> brandIds) {
        return null;
    }

    @Override
    public ResponseEntity<?> createNewBrand(BrandPostVm brand) {
        return null;
    }
}
