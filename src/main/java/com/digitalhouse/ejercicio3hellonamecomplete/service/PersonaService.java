package com.digitalhouse.ejercicio3hellonamecomplete.service;

import com.digitalhouse.ejercicio3hellonamecomplete.model.Persona;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService{


    @Override
    public void crearPersona(Persona per) {
            //Aca creamos una persona
    }

    @Override
    public List<Persona> traerPersonas() {
      //Aca buscamos todas las personas para devolver
        return null; // Aca devuelve la lista de personas (no null)
    }
}
