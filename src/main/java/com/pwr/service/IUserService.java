package com.pwr.service;


import com.pwr.model.UserTO;

import java.util.List;

public interface IUserService {

   public List<UserTO> findAllUsers();

   public void createUser();
}
