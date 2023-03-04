package com.bookstore.product.repository;

import com.bookstore.product.entity.Brand;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Long> {
    Optional<List<Brand>> findAllByIsActive(Boolean isActive);
}
