package com.inventario.nexos.persistence;

import com.inventario.nexos.domain.Part;
import com.inventario.nexos.domain.repository.PartRepository;
import com.inventario.nexos.persistence.crud.PiezaCrudRepository;
import com.inventario.nexos.persistence.entity.Pieza;
import com.inventario.nexos.persistence.mapper.PartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PiezaRespository implements PartRepository {

    @Autowired
    private PiezaCrudRepository piezaCrudRepository;
    @Autowired
    private PartMapper mapper;

    @Override
    public List<Part> getAll(){
        List<Pieza> piezas= (List<Pieza>)piezaCrudRepository.findAll();
        return mapper.toParts(piezas);
    }

    @Override
    public Optional<List<Part>> getByPart(int idPart) {
        List<Pieza> piezas= piezaCrudRepository.findByIdPieza(idPart);
        return Optional.of(mapper.toParts(piezas));
    }

    @Override
    public Optional<List<Part>> getScarseParts(int quantity) {
        Optional <List<Pieza>> piezas = piezaCrudRepository.findByCantidadLessThan(quantity);
        return piezas.map(pzs->mapper.toParts(pzs));
    }

    @Override
    public List<Part> findByIdPieza(int idPieza) {
        List<Pieza> part =piezaCrudRepository.findByIdPieza(idPieza);
        return mapper.toParts(part);
    }


    @Override
    public Optional<List<Part>> findByPart(String part) {
        Optional<List<Pieza>> piezas= piezaCrudRepository.findByPieza(part);
        return piezas.map((pc)->mapper.toParts(pc));
    }


    @Override
    public Optional<Part> getPart(int idPart) {
        return piezaCrudRepository.findById(idPart).map(pzz->mapper.toPart(pzz));
    }

    @Override
    public Part save(Part part) {
        Pieza pieza= mapper.toPieza((part));
        return mapper.toPart((piezaCrudRepository.save(pieza)));
    }

    @Override
    public void deleteById(int idPart) {
        piezaCrudRepository.deleteById(idPart);
    }

    @Override
    public boolean existsByPieza(String pieza) {
        return piezaCrudRepository.existsByPieza(pieza);
    }



}
