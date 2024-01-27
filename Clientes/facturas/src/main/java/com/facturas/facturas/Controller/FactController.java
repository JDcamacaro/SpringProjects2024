package com.facturas.facturas.Controller;


import com.facturas.facturas.Model.FactModel;
import com.facturas.facturas.Servicio.FactServicio;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "/factura")

public class FactController {

    @Autowired
    FactServicio factServicio;

    @GetMapping
    public List<FactModel> getAll() {
        return factServicio.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<FactModel> getById(@PathVariable("id") Integer id) {
        return factServicio.findById(id);
    }

    @PostMapping(path = "/crear")
    public FactModel crearFact(@RequestBody FactModel factModel){
        return factServicio.crearFact(factModel);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteFact(@PathVariable("id") Integer id){
        factServicio.deleteFact(id);
    }

    
    
    
}