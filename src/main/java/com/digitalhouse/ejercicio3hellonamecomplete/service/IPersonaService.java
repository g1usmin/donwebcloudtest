package com.digitalhouse.ejercicio3hellonamecomplete.service;

import com.digitalhouse.ejercicio3hellonamecomplete.model.Persona;
import java.util.List;


public interface IPersonaService {

    public void crearPersona(Persona per);
    public List<Persona> traerPersonas();



}
