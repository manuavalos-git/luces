package servicios;

import java.util.Random;

public class Tablero {
	private boolean [][] tabla;
	private int filasYColum;
	
	public Tablero(int fYc) {
		this.tabla =new boolean [fYc][fYc];
		this.filasYColum=fYc;
	}
	protected boolean faltaResolver(){
		boolean faltaResolver=false;
		for(int fila=0;fila<this.filasYColum;fila++) {
			for(int colum=0;colum<this.filasYColum;colum++) {
				faltaResolver=faltaResolver ||this.tabla[fila][colum];
				if(faltaResolver) {
					return faltaResolver;
				}
			}
		}
		return faltaResolver;
	}
	protected void prenderLuzInicio(int cantLuces) {
		for(int i=0;i<cantLuces;i++) {
			Random random1=new Random();
			Random random2=new Random();
			int nFila=(int)(random1.nextDouble()*this.filasYColum);
			int nColum=(int)(random2.nextDouble()*this.filasYColum);
			this.tabla[nFila][nColum]=true;
		}
	}
	private void cambiarEstadoLuz(int fila,int colum) {
		if (this.tabla[fila][colum] ) {
			this.tabla[fila][colum] =false;
		}	
		else {
			this.tabla[fila][colum] =true;
		}	
	}
	protected void click(int fila,int colum){
		cambiarEstadoLuz(fila, colum);
			if(fila>0 && fila<this.filasYColum-1 && colum>0 && colum<this.filasYColum-1) {
				cambiarEstadoLuz(fila-1, colum);
				cambiarEstadoLuz(fila+1, colum);
				cambiarEstadoLuz(fila, colum+1);
				cambiarEstadoLuz(fila, colum-1);
			}
			else if(fila==0 ) {
				if(colum==0) {
					cambiarEstadoLuz(fila, colum+1);
					cambiarEstadoLuz(fila+1, colum);
				}
				else if(colum==4) {
					cambiarEstadoLuz(fila, colum-1);
					cambiarEstadoLuz(fila+1, colum);
				}
				else {
					cambiarEstadoLuz(fila, colum+1);
					cambiarEstadoLuz(fila, colum-1);
					cambiarEstadoLuz(fila+1, colum);
				}
			}
			else if(fila==this.filasYColum-1 ) {
				if(colum==0) {
					cambiarEstadoLuz(fila, colum+1);
					cambiarEstadoLuz(fila-1, colum);
				}
				else if(colum==4) {
					cambiarEstadoLuz(fila, colum-1);
					cambiarEstadoLuz(fila-1, colum);
				}
				else {
					cambiarEstadoLuz(fila, colum+1);
					cambiarEstadoLuz(fila, colum-1);
					cambiarEstadoLuz(fila-1, colum);
				}
			}
			else if(colum==0) {
				cambiarEstadoLuz(fila+1, colum);
				cambiarEstadoLuz(fila-1, colum);
				cambiarEstadoLuz(fila, colum+1);
			}
			else {
				cambiarEstadoLuz(fila+1, colum);
				cambiarEstadoLuz(fila-1, colum);
				cambiarEstadoLuz(fila, colum-1);
			}
	}
	
	protected boolean getEstado(int fila,int colum) {
		return this.tabla[fila][colum];
	}
	                          
}
