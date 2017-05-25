package com.pwr.repository;

import com.pwr.model.ProductBaseEntity;
import com.pwr.model.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by lodwr on 06.05.2017.
 */
public interface ProductBaseRepository extends JpaRepository<ProductBaseEntity, Long> {
  List<ProductBaseEntity> findAllByNameStartingWith(String name);
}
