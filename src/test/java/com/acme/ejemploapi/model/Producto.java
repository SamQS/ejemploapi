package com.acme.ejemploapi.model;

import lombok.*;

@Getter 
@Setter 
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Producto{
 
    private String id;
    private String nombre;
    private String descripcion;
    private String precio;
    private String cantidad;


}