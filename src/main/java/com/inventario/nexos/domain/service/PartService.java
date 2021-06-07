package com.inventario.nexos.domain.service;

import com.inventario.nexos.domain.Part;
import com.inventario.nexos.domain.repository.PartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PartService {

    @Autowired
    private PartRepository partRepository;

    public List<Part> getAll(){
        return partRepository.getAll();
    }
    public Optional<Part> getPart(int idPart){
        return partRepository.getPart(idPart);
    }
    public Optional<List<Part>> findByPart(String part){
        return partRepository.findByPart(part);
    }
    public Optional<List<Part>> getByPart(int idPart){
        return partRepository.getByPart(idPart);
    }
    public Part save(Part part){
        return partRepository.save(part);
    }
    public void deleteById(int idPart){
        partRepository.deleteById(idPart);
        /*return getPart(idPart).map(pzs->{
            return true;
        }).orElse(false);

         */
    }
    public boolean existsByPieza(String pieza){
        return partRepository.existsByPieza(pieza);
    }


}
