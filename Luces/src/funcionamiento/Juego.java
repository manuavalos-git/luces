package funcionamiento;

public class Juego{
	public Tablero tablero;
	
	public Juego(int tama�o,int cantLuces) {
		this.tablero= new Tablero(tama�o);
		tablero.prenderLuzInicio(cantLuces);
	}
	public boolean faltaResolver() {
		return this.tablero.faltaResolver();
	}
}
