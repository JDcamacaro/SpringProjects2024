package com.facturas.facturas.Repository;


import com.facturas.facturas.Model.FactModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FactRepository extends JpaRepository<FactModel, Integer> {
}
