package com.pedro.logica;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.pedro.datos.Datos;


public class Logica {
	
	public Integer logic (String nombre) throws IOException {
		
		Datos datos = new Datos();
		
		int resultado = datos.consultaPeso(nombre)/datos.consultaAltura(nombre);
		
		
		return resultado;	
	
	
	}
	
}
