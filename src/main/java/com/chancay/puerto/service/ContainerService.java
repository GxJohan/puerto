package com.chancay.puerto.service;
//Aqui viene la logica del negocio
//como habíamos mencionado la lógica para este
//Modelo/Entidad será CRUD
import com.chancay.puerto.model.Container;
import com.chancay.puerto.repository.ContainerRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class ContainerService {
    
    @Autowired
    private ContainerRepository containerRepository;

    //método para llamar a todos los contenedores
    public List<Container> getContainers(){
        return containerRepository.findAll();
    }

    //método para llamar a un contenedor en especifico
    public Container getContainerById(Integer id){
        return containerRepository.findById(id).orElse(null);
    }

    //método pára registrar un nuevo contenedor
    public Container createContainer(Container container){
        return containerRepository.save(container);
    }

    //método para actualizar un contenedor existente
    public Container updateContainer(Container container, Integer id){
        Container cont = containerRepository.findById(id).orElse(null);
        if(cont != null){
            //existe el contenedor a editar.
            
        }
        return null;
        
    }


}
