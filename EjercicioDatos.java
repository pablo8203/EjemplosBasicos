package com.pjs.app;

import java.util.*; 

public class EjercicioDatos {
	Scanner informe = new Scanner(System.in);
	public void datos(String nombre,String apellido,int edad){ 
		System.out.println("Ingrese el nombre"); 
		nombre = informe.next(); 
		System.out.println("Ingrese el apellido"); 
		apellido = informe.next(); 
		System.out.println("Ingrese su edad"); 
		edad = informe.nextInt(); 
		System.out.println("Los datos del usuario son "+nombre+" "+apellido+" y su edad es "+edad); }
	public static void main(String[]args){
EjercicioDatos robi = new EjercicioDatos();
robi.datos(" ","",0); 
}
 }