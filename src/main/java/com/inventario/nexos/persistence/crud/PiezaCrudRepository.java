package com.inventario.nexos.persistence.crud;

import com.inventario.nexos.domain.Part;
import com.inventario.nexos.persistence.entity.Pieza;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface PiezaCrudRepository extends CrudRepository<Pieza, Integer> {

    List<Pieza> findByIdPieza(int idPieza);

    Optional<List<Pieza>>findByCantidadLessThan(int cantidad);

    Optional<List<Pieza>>findByPieza(String pieza);

    Pieza save(Pieza pieza);

    void deleteById(int idPart);

    boolean existsByPieza(String pieza);


}
