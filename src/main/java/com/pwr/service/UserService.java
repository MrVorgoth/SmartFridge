package com.pwr.service;


import com.pwr.mappers.UserMapper;
import com.pwr.model.UserEntity;
import com.pwr.model.UserTO;
import com.pwr.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserTO> findAllUsers() {
        List<UserTO> result = new ArrayList<>();
        userRepository.findAll().forEach(userEntity -> result.add(UserMapper.mapUser(userEntity)));
        return result;
    }

    @Override
    public void createUser() {
        UserEntity user = new UserEntity();
        user.setName("Janusz");
        user.setSurname("Cebula");
        user.setLogin("login");
        user.setPassword("login");
        userRepository.save(user);
    }
}
