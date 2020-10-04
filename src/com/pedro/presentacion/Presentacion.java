package com.pedro.presentacion;

import java.io.IOException;
import java.util.Scanner;

import com.pedro.logica.Logica;

public class Presentacion {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el nombre de la persona."+"\n");
		
		String nombre = sc.next();
		
		System.out.println("El IMC es: " + new Logica().logic(nombre));

	}

}
