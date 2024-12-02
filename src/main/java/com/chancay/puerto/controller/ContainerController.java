package com.chancay.puerto.controller;
//Esta clase es importante para conectar la app
//con el navegador web. Dado que spring es un
//servicio que ejecuta en el lado del servidor
//y para conectarlo se realizará esta clase
import com.chancay.puerto.model.Container;
import com.chancay.puerto.service.ContainerService;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/containers")
public class ContainerController {
    
    @Autowired
    private ContainerService containerService;
    
    //Método para llamar a los contenedores
    @GetMapping
    public List<Container> getContainers(){
        return containerService.getContainers();
    }

    //Método para llamar a un contenedor por su id
    @GetMapping("/{id}")
    public ResponseEntity<Container> getContainerById
    (@PathVariable Integer id){
        Container cont = containerService.getContainerById(id);
        if(cont != null){
            return ResponseEntity.ok(cont);
        }
        return ResponseEntity.notFound().build();
    }

    //Metodo para crear un registro de un contenedor
    @PostMapping
    public Container createContainer(@RequestBody Container container){
        return containerService.createContainer(container);
    }

    //Método para actualizar contenedor por su id
    @PutMapping("/{id}")
    public ResponseEntity<Container> updateContainer
    (@RequestBody Container container, @PathVariable Integer id){
        Container cont = containerService.updateContainer(container, id);
        if (cont != null){
            return ResponseEntity.ok(cont);
        }
        return ResponseEntity.notFound().build();
    }

    //Método para eliminar contenedor por su id
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteContenedor
    (@PathVariable Integer id){
        containerService.deleteContenedor(id);
        return ResponseEntity.ok().build();
    }





}
