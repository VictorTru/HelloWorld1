package com.pe;

import java.util.Scanner;

public class Mensaje {

    public String solicitarDatos(String mensaje){
        System.out.println(mensaje);
        Scanner leer = new Scanner(System.in);
        return leer.nextLine();
    }

    public void saludar(Persona p) {
        System.out.printf("Hola %s, Bienvenido a Java \n",p);
    }
}
