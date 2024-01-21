package com.facturas.facturas.Repository;

import org.springframework.stereotype.Repository;

@Repository

public interface FactRepository extends package packageName;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//Remove @RepositoryRestResource below to disable auto REST api:
@RepositoryRestResource
public interface repositoryName extends CrudRepository<FactModel, ID>{} {

    
}