package com.inventario.nexos.domain.service;

import com.inventario.nexos.domain.Part;
import com.inventario.nexos.domain.User;
import com.inventario.nexos.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAll(){
        return userRepository.getAll();
    }

    public User save(User user){
        return userRepository.save(user);
    }
}
