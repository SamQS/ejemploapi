package com.acme.ejemploapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import com.acme.ejemploapi.model.Producto;


@RestController
@RequestMapping(value ="api/producto", produces ="application/json")
@ComponentScan(basePackages = "com.solution.controller,"+"com.solution.mobiquity.service")

public class ProductoController {
    private Map<String,Producto> productos;

    public ProductoController(){
        productos = new HashMap<String,Producto>();
        Producto p = new Producto();        
        p.setNombre("nombre");
        p.setDescripcion("descripcion del producto");
        p.setPrecio("00.00");
        p.setCantidad("999");
        String id = UUID.randomUUID().toString();
        p.setId(id);
        productos.put(id,p);
}

@GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    
public ResponseEntity <Map<String,Producto>> listaall(){
    return new ResponseEntity<Map<String,Producto>>(productos,HttpStatus.OK);
        


}
}