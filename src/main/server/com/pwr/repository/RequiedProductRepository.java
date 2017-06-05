package com.pwr.repository;

import com.pwr.model.ProductBaseEntity;
import com.pwr.model.RequiedProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Magda Zielonka on 18.05.2017.
 */
public interface RequiedProductRepository extends JpaRepository<RequiedProductEntity, Long> {

}
