package com.facturas.facturas.Controller;


import com.facturas.facturas.Model.FactModel;
import com.facturas.facturas.Servicio.FactServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping(path = "factura")

public class FactController {

    @Autowired
    FactServicio factServicio;

    @GetMapping(path = "/todos")
    public List<FactModel> getAll() {
        return factServicio.findAll();
    }

    @GetMapping(path = "/{id}")
    public List<FactModel> getById(@PathVariable Integer id) {
        return factServicio.getById(id);
    }

    @PostMapping(path = "/crear")
    public FactModel crearFact(FactModel factModel){
        return factServicio.crearFact(factModel);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteFact(@PathVariable Integer id){
        factServicio.deleteFact(id);
    }

    
    
    
}