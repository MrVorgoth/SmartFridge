package com.pwr.repository;

import com.pwr.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Magda on 2017-04-10.
 */
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
