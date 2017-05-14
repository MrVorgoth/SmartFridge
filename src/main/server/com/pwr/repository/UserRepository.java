package com.pwr.repository;

import com.pwr.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Magda on 2017-04-10.
 */
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    List<UserEntity> findByLogin(String login);
}
