package com.pwr.repository;

import com.pwr.model.CategoryEntity;
import com.pwr.model.ProductBaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
}
