package com.facturas.facturas.Controller;


import com.facturas.facturas.Repository.FactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "factura")

public class FactController {

    @Autowired
    FactRepository factRepository;


}