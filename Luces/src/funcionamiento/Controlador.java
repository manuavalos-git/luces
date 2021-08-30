package funcionamiento;

import Interfaz.Usuario;

public class Controlador extends Usuario{
	public Tablero tablero;
	
	public Controlador(int tamaño,int cantLuces) {
		this.tablero= new Tablero(tamaño);
		tablero.prenderLuzInicio(cantLuces);
	}
	public boolean faltaResolver() {
		return this.tablero.faltaResolver();
	}
}
