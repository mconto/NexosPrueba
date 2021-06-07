package com.inventario.nexos.domain.repository;


import com.inventario.nexos.domain.User;
import java.util.List;


public interface UserRepository {

    List<User> getAll();
    User save(User user);
}
