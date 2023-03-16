package com.pjs.app;

class Usuario {
    //Atributos
    String nombre = "Jose";
    String apellidos =  "Sosa";
    int edad = 27;
    String direccion = "Calle Falsa 123";
    String telefono = "+5493815651270";
}

public class Clases {
    public static void main(String[] args) {
        //Instancias de la clase Usuario
        Usuario usuario1 = new Usuario();
        //Usuario usuario2 = new Usuario();

        //Se imprimen valores de los objetos
        System.out.println(usuario1.direccion);
              
    }
}