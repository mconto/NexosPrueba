package com.inventario.nexos.web.controller;


import com.inventario.nexos.domain.Part;
import com.inventario.nexos.domain.User;
import com.inventario.nexos.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/all")
    public List<User>getAll(){
        return userService.getAll();
    }


    @PostMapping("/save")
    public boolean save(@RequestBody User usernew){
        userService.save(usernew);
        return true;
    }
}
