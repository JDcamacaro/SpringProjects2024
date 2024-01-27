package com.facturas.facturas.Servicio;

import java.util.ArrayList;
import java.util.Optional;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.facturas.facturas.Model.FactModel;
import com.facturas.facturas.Repository.FactRepository;

import io.micrometer.common.lang.NonNull;

@Service
public class FactServicio {

    @Autowired
    FactRepository factRepository;

    public Optional<FactModel> findById(Integer id){
        return factRepository.findById(id);
    }


    public Optional<FactModel> findAll(@PathVariable(name = "id")Integer id){
        return factRepository.findAll(id);
    }


}
