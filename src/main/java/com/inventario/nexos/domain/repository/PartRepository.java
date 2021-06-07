package com.inventario.nexos.domain.repository;

import com.inventario.nexos.domain.Part;

import java.util.List;
import java.util.Optional;

public interface PartRepository {

    List<Part> getAll();
    Optional<List<Part>> getByPart(int idPart);
    Optional<List<Part>> getScarseParts(int quantity);
    List<Part> findByIdPieza(int idPieza);
    Optional<List<Part>>findByPart(String part);

    Optional<Part>getPart(int idPart);
    Part save(Part part);
    void deleteById(int idPart);
    boolean existsByPieza(String pieza);
 }
