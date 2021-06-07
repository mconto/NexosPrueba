package com.inventario.nexos.web.controller;

import com.inventario.nexos.domain.Part;
import com.inventario.nexos.domain.service.PartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/parts")
public class PartController<idPart> {

    @Autowired
    private PartService partService;

    @GetMapping("/all")
    public List<Part>getAll(){
        return partService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Part>getPart(@PathVariable("id") int idPart){
        return partService.getPart(idPart);
    }

    @GetMapping("/devuelvepieza/{p}")
    public Optional<List<Part>> findByPart(@PathVariable("p") String part) {
        return partService.findByPart(part);
    }

    @PostMapping("/save")
    public boolean save(@RequestBody Part partenueva){
            partService.save(partenueva);
            return true;
        }


    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int idPart){
        partService.deleteById(idPart);
        return true;
        }

    @PostMapping("/savesecure")
    public boolean savesecure(@RequestBody Part partenueva){
        LocalDateTime fechahoy = LocalDateTime.now();
        if (!partService.existsByPieza(partenueva.getPart()) && partenueva.getDateRegister().isBefore(fechahoy)){
                partService.save(partenueva);
                return true;
            }
        else {
            return false;
        }
    }


    @PostMapping("/update/{id}")
    public boolean update(@RequestBody Part partenueva, @PathVariable("id") int idPart){
            Part parte=partService.getPart(idPart).get();
            parte.setPart(partenueva.getPart());
            parte.setQuantity(partenueva.getQuantity());
            parte.setDateRegister(partenueva.getDateRegister());
            parte.setUsercharged(partenueva.getUsercharged());
            LocalDateTime fechahoy = LocalDateTime.now();
        if (!partService.existsByPieza(parte.getPart()) && parte.getDateRegister().isBefore(fechahoy)){
            partService.save(parte);
            return true;
        }
        else {
            return false;
        }


    }

}

