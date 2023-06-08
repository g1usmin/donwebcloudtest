package com.digitalhouse.ejercicio3hellonamecomplete.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Propiedad {

    private Long id_propiedad;
    private String tipo_propiedad;
    private String direccion;
    private Double metros_cuadrados;
    private Double valor_alquile;

    public Propiedad() {
    }

    public Propiedad(Long id_propiedad, String tipo_propiedad, String direccion, Double metros_cuadrados, Double valor_alquile) {
        this.id_propiedad = id_propiedad;
        this.tipo_propiedad = tipo_propiedad;
        this.direccion = direccion;
        this.metros_cuadrados = metros_cuadrados;
        this.valor_alquile = valor_alquile;
    }




}
