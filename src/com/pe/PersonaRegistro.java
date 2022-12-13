package com.pe;

public record PersonaRegistro(String nombre, String apellidos) {

    @Override
    public String toString() {
        // Esta linea ya esta revisada
        //System.out.println("Esta instruccion es inservible");
        return "%s %s".formatted(nombre,apellidos);
    }

}
