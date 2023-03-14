package com.pjs.app;

public class MiClase {
    // Función que imprime el doble de un número
    void imprimirDoble(int num) { 
        // Calcula el doble del número pasado como parámetro
        int resultado = num * 2; 
        // Imprime el resultado en la consola
        System.out.println("El doble de " + num + " es " + resultado);
    }


public static void main(String[] args) {
    MiClase objeto = new MiClase();
    // Llama a la función pasando el número 5 como parámetro
    objeto.imprimirDoble(70);
}
}