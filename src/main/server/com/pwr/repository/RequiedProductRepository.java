package com.pwr.repository;

import com.pwr.model.ProductBaseEntity;
import com.pwr.model.RequiedProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Ania on 04.06.2017.
 */
public interface RequiedProductRepository extends JpaRepository<RequiedProductEntity, Long> {
}
