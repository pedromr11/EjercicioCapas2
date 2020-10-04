package com.pedro.datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Datos {
	
	public Integer consultaPeso(String nombre) throws IOException {
			
			File file = new File("C:\\Users\\Usuario\\Desktop\\EjercicioCapas2.txt");
			BufferedReader lector;
			
			lector = new BufferedReader(new FileReader(file));
			String linea;
			
			while((linea = lector.readLine()) != null) {
				
				if(linea.contains(nombre)) {
					
					return recuperarPeso(linea);
				}
			}
			
			
			return null;
		}
	
	public Integer consultaAltura(String nombre) throws IOException {
		
		File file = new File("C:\\Users\\Usuario\\Desktop\\EjercicioCapas2.txt");
		BufferedReader lector;
		
		lector = new BufferedReader(new FileReader(file));
		String linea;
		
		while((linea = lector.readLine()) != null) {
			
			if(linea.contains(nombre)) {
				
				return recuperarAltura(linea);
			}
		}
		
		
		return null;
	}
		
		
		public Integer recuperarPeso(String linea){
			String[] arrayPersona = linea.split("-");			
			
			return Integer.parseInt(arrayPersona[1]);
		}
		
		
		public Integer recuperarAltura(String linea){
			String[] arrayPersona = linea.split("-");			
			
			return Integer.parseInt(arrayPersona[2]);
		}
}
