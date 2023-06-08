package com.digitalhouse.ejercicio3hellonamecomplete.Controller;

import com.digitalhouse.ejercicio3hellonamecomplete.model.Cliente;
import com.digitalhouse.ejercicio3hellonamecomplete.model.Inquilino;
import com.digitalhouse.ejercicio3hellonamecomplete.model.Propiedad;
import com.digitalhouse.ejercicio3hellonamecomplete.dto.PropiedadDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controladora {

    @GetMapping("/hello")
    public String sayHello() {

        return "Hello World";
    }

    @GetMapping("/hello/{name}")
    public String sayHelloName(@PathVariable String name) {

        return "Hello World " + name;
    }

    @GetMapping("/hello/{name}/{lastname}/{age}")
    public String sayHelloComplete(@PathVariable String name,
                                   @PathVariable String lastname,
                                   @PathVariable int age) {
        return "Hello World! Tu nombre es " + name + ", tu apellido es " + lastname + " y tenes " + age + " años";

    }


    @PostMapping("/cliente")
    public void nuevoCliente(@RequestBody Cliente cli) {
        System.out.println("Datos del cliente: Nombre " + cli.getNombre() + " Apellido: " + cli.getApellido());

    }

    @GetMapping("/cliente/traer")
    @ResponseBody
    public List<Cliente> traerClientes() {

        List<Cliente> listaClientes = new ArrayList<Cliente>();
        listaClientes.add(new Cliente(1L, "Zlatan", "Ibrahimovic"));
        listaClientes.add(new Cliente(2L, "Cristiano", "Ronaldo"));
        listaClientes.add(new Cliente(3L, "Lionel", "Messi"));

        return listaClientes;

    }

    @GetMapping("/pruebaresponse")
    ResponseEntity<String> traerRespuestaA() {

        return new ResponseEntity<>("Esto es un mensaje Response Entity", HttpStatus.OK);

    }


    @GetMapping("/propiedad/{id}")
    @ResponseBody
    public PropiedadDTO devolverPropiedad(@PathVariable Long id) {

        Inquilino inqui = new Inquilino(1L, "123455", "Walter", "White", "Profesor");
        Propiedad prop = new Propiedad(25L, "Casa", "2342 Alburqueque", 200.0, 40000.0);

        PropiedadDTO propiDTO = new PropiedadDTO();

        propiDTO.setId_propiedad(prop.getId_propiedad());
        propiDTO.setTipo(prop.getTipo_propiedad());
        propiDTO.setDireccion(prop.getDireccion());
        propiDTO.setValor_alquiler(prop.getValor_alquile());
        propiDTO.setNombre_inquilino(inqui.getNombre());
        propiDTO.setApellido_inquilino(inqui.getApellido());

        return propiDTO;


    }


}
