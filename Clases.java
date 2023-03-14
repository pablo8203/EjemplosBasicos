package com.pjs.app;

class Usuario {
    //Atributos
    String nombre = "Silvia";
    String apellidos =  "Blanes Alarcón";
    int edad = 27;
    String direccion = "Enrique Granados, 7";
    String telefono = "+34-91-000-000";
}

public class Clases {
    public static void main(String[] args) {
        //Instancias de la clase Usuario
        Usuario usuario1 = new Usuario();
        //Usuario usuario2 = new Usuario();

        //Se imprimen valores de los objetos
        System.out.println(usuario1.nombre);
        System.out.println(usuario1.apellidos);
        //System.out.println(usuario2.nombre);
    }
}