package com.bookstore.product.services.impl;

import com.bookstore.product.entity.Brand;
import com.bookstore.product.repository.BrandRepository;
import com.bookstore.product.services.BrandService;
import com.bookstore.product.viewmodel.BrandPostVm;
import com.bookstore.product.viewmodel.BrandVm;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandRepository brandRepository;

    @Override
    public List<BrandVm> getAllBrand(int pageNo) {
        Pageable pageable = PageRequest.of(pageNo, 10);
        List<Brand> brands= brandRepository.findAll(pageable).getContent();

        return brands.stream().map(BrandVm::fromModel).toList();
    }

    @Override
    public List<BrandVm> getAllActiveBrand(int pageNo) {
        Pageable pageable = PageRequest.of(pageNo, 10);
        List<Brand> brands = brandRepository.findAllByIsActiveTrue(pageable).getContent();
        return brands.stream().map(BrandVm::fromModel).toList();
    }

    @Override
    public BrandVm getBrandById(Long brandId) {
        Brand brand = brandRepository.findById(brandId).orElseThrow(() -> new NotFoundException("Brand Not Found"));
        return BrandVm.fromModel(brand);
    }

    @Override
    public ResponseEntity<?> updateBrand(Long brandId, BrandPostVm brand) {
        Brand oldBrand = brandRepository.findById(brandId).orElseThrow(() -> new NotFoundException("Brand Not Found"));
        if (oldBrand.getIsActive()) {
            oldBrand.setName(brand.name());
            oldBrand.setSlug(brand.slug());
            return ResponseEntity.of(Optional.of(brandRepository.save(oldBrand)));
        }
        return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).build();
    }

    @Override
    public ResponseEntity<?> activeBrand(Long brandId) {
        Brand brand = brandRepository.findById(brandId).orElseThrow(() -> new NotFoundException("Brand Not Found"));
        brand.setIsActive(true);
        return ResponseEntity.of(Optional.of(brandRepository.save(brand)));
    }

    @Override
    public ResponseEntity<?> disActiveBrand(Long brandId) {
        Brand brand = brandRepository.findById(brandId).orElseThrow(() -> new NotFoundException("Brand Not Found"));
        brand.setIsActive(false);
        return ResponseEntity.of(Optional.of(brandRepository.save(brand)));
    }

    @Override
    public ResponseEntity<?> createNewBrand(BrandPostVm brand) {
        Brand newBrand = brand.toModel();
        // just temporary
        newBrand.setLastModifyBy("OWNER");
        newBrand.setCreateBy("OWNER");

        return ResponseEntity.of(Optional.of(brandRepository.save(newBrand)));
    }
}
