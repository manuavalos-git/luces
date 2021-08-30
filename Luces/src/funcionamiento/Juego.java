package funcionamiento;

public class Juego{
	public Tablero tablero;
	
	public Juego(int tamaño,int cantLuces) {
		this.tablero= new Tablero(tamaño);
		tablero.prenderLuzInicio(cantLuces);
	}
	public boolean faltaResolver() {
		return this.tablero.faltaResolver();
	}
}
