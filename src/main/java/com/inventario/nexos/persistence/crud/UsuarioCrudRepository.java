package com.inventario.nexos.persistence.crud;

import com.inventario.nexos.domain.User;
import com.inventario.nexos.persistence.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsuarioCrudRepository extends CrudRepository<Usuario, Integer> {



}
