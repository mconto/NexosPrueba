package com.inventario.nexos.persistence;


import com.inventario.nexos.domain.Part;
import com.inventario.nexos.domain.User;
import com.inventario.nexos.domain.repository.UserRepository;
import com.inventario.nexos.persistence.crud.UsuarioCrudRepository;
import com.inventario.nexos.persistence.entity.Pieza;
import com.inventario.nexos.persistence.entity.Usuario;
import com.inventario.nexos.persistence.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UsuarioRepository implements UserRepository {

    @Autowired
    UserMapper mapper;

    @Autowired
    UsuarioCrudRepository usuarioCrudRepository;


    @Override
    public List<User> getAll(){
        List<Usuario> usuarios= (List<Usuario>)usuarioCrudRepository.findAll();
        return mapper.toUsers(usuarios);
    }


    @Override
    public User save(User user) {
        Usuario usuario= mapper.toUsuario((user));
        return mapper.toUser((Usuario) usuarioCrudRepository.save(usuario));
    }

}
