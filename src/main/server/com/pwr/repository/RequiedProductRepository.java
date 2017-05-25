package com.pwr.repository;

import com.pwr.model.ProductBaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Magda Zielonka on 18.05.2017.
 */
public interface RequiedProductRepository extends JpaRepository<ProductBaseEntity, Long> {
}
