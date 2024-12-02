package com.chancay.puerto.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@Entity
@Table(name = "container")
public class Container {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;//clave primaria autoincremental

    @Column(unique = true, nullable = false)
    private Long codigo;//código unico de contenedor

    @Column(nullable = false, length = 50)
    private String origen;//pais de origen

    @Column(nullable = false)
    private Double peso;//peso en KG







}
