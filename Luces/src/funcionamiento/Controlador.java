package funcionamiento;

import Interfaz.Usuario;

public class Controlador extends Usuario{
	public Tablero tablero;
	
	public Controlador(int tama�o,int cantLuces) {
		this.tablero= new Tablero(tama�o);
		tablero.prenderLuzInicio(cantLuces);
	}
	public boolean faltaResolver() {
		return this.tablero.faltaResolver();
	}
}
