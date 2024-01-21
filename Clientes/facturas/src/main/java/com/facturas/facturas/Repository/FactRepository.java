package com.facturas.facturas.Repository;


import com.facturas.facturas.Servicio.FactServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FactRepository {

    @Autowired
    FactServicio factServicio;

}
