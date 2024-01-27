package com.facturas.facturas.Controller;


import com.facturas.facturas.Model.FactModel;
import com.facturas.facturas.Repository.FactRepository;
import com.facturas.facturas.Servicio.FactServicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping(path = "factura")

public class FactController {

    @Autowired
    FactServicio factServicio;

    @GetMapping(path = "{Nombre}")
    public List<FactModel> getAll() {
        return factServicio.findById(null);
    }


    
    
    
}