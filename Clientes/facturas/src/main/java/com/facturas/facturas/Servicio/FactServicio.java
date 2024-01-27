package com.facturas.facturas.Servicio;



import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.facturas.facturas.Model.FactModel;
import com.facturas.facturas.Repository.FactRepository;





@Service
public class FactServicio {

    @Autowired
    FactRepository factRepository;

    public ArrayList<FactModel> findAll(){
        return (ArrayList<FactModel>) factRepository.findAll();
    }

    public Optional<FactModel> findById(Integer id){
        return factRepository.findById(id);
    }

    public FactModel crearFact(FactModel factModel){
        return factRepository.save(factModel);
    }

    public void deleteFact(Integer id) { 
        factRepository.deleteById(id);
    }




}
