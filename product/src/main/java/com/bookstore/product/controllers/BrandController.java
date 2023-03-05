package com.bookstore.product.controllers;

import com.bookstore.product.services.BrandService;
import com.bookstore.product.viewmodel.BrandPostVm;
import com.bookstore.product.viewmodel.BrandVm;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/brand")
public class BrandController {
    public final BrandService brandService;

    public BrandController (BrandService brandService) {
        this.brandService = brandService;
    }
    @GetMapping("/")
    ResponseEntity<?> greeting() {
        return ResponseEntity.ok("hello world!");
    }

    @GetMapping("/all/{pageNo}")
    ResponseEntity<List<BrandVm>> getAllBrand(@PathVariable int pageNo) {
        List<BrandVm> brands = brandService.getAllBrand(pageNo);
        return ResponseEntity.ok(brands);
    }

    @GetMapping("/active/{pageNo}")
    ResponseEntity<List<BrandVm>> getAllActiveBrand(@PathVariable int pageNo) {
        List<BrandVm> brands = brandService.getAllActiveBrand(pageNo);
        return ResponseEntity.ok(brands);
    }

    @GetMapping("/{brandId}")
    ResponseEntity<BrandVm> getBrand(@PathVariable Long brandId) {
        BrandVm brand = brandService.getBrandById(brandId);
        return ResponseEntity.ok(brand);
    }

    @PutMapping("/{brandId}")
    ResponseEntity<?> updateBrand(@PathVariable Long brandId, @RequestBody BrandPostVm brandPostVm) {
        return this.brandService.updateBrand(brandId, brandPostVm);
    }

    @PatchMapping("/{brandId}")
    ResponseEntity<?> activeBrand(@PathVariable Long brandId) {
        return this.brandService.activeBrand(brandId);
    }

    @DeleteMapping("/{brandId}")
    ResponseEntity<?> disActiveBrand(@PathVariable Long brandId) {
        return this.brandService.disActiveBrand(brandId);
    }

    @PostMapping("/")
    ResponseEntity<?> createNewBrand(@RequestBody BrandPostVm brandPostVm) {
        return this.brandService.createNewBrand(brandPostVm);
    }

}
