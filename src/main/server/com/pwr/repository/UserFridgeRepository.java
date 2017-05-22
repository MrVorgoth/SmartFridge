package com.pwr.repository;

import com.pwr.model.ProductBaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserFridgeRepository extends JpaRepository<ProductBaseEntity, Long> {
}
