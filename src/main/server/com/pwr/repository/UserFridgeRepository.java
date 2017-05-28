package com.pwr.repository;

import com.pwr.model.ProductBaseEntity;
import com.pwr.model.ProductTO;
import com.pwr.model.UserFridgeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserFridgeRepository extends JpaRepository<UserFridgeEntity, Long> {
    UserFridgeEntity findByUserId(long id);
}
