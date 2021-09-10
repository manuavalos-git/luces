package servicio;

import java.util.ArrayList;
import java.util.Random;

public class Tablero {
	private boolean [][] tabla;
	private int filasYColum;
	
	//se contruye un tablero de 4x4
	public Tablero() {
		this.filasYColum=4;
		this.tabla =new boolean [this.filasYColum][this.filasYColum];
	}
	//recorre el tablero para saber si esta resuelto o falta resolver
	public boolean faltaResolver(){
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
	//elige entre los cuadros predeterminados con solucion para prender(setear a true) las luces al iniciar
	public void prenderLuzInicio() {
		elegirCuadro();
	}
	//cambia el estado de las luces vecinas de la luz pulzada
	public void click(int fila,int colum){
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
				else if(colum==3) {
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
				else if(colum==3) {
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
	public boolean getEstado(int i, int j){
		return this.tabla[i][j];
	}
	//aleatoriamente decide que cuadro usar
	private void elegirCuadro() {
		ArrayList<boolean[][]> estadosIniales=new ArrayList<boolean[][]>();
		Random random=new Random();
		int indice=(int)(random.nextDouble()*5);
		estadosIniales.add(estado0());
		estadosIniales.add(estado1());
		estadosIniales.add(estado2());
		estadosIniales.add(estado3());
		estadosIniales.add(estado4());
		this.tabla=estadosIniales.get(indice);
	}
	//cuadros posibles
	private boolean[][] estado4() {
		boolean[][] estado4= {{false,false,true,false},
							  {false,true,false,false},
							  {false,true,true,true},
							  {false,false,false,false}};
		return estado4;
	}
	private boolean[][] estado3() {
		boolean[][] estado3= {{true,false,false,false},
							  {true,true,true,false},
							  {false,true,true,false},
							  {true,true,false,true}};
		return estado3;
	}
	private boolean[][] estado2() {
		boolean[][] estado2= {{false,false,true,true},
							  {true,true,true,true},
							  {true,false,false,false},
							  {true,true,true,true}};
		return estado2;
	}
	private boolean[][] estado1() {
		boolean[][] estado1= {{true,true,true,true},
							  {true,true,true,true},
							  {false,false,false,true},
							  {true,false,true,false}};
		return estado1;
	}
	private boolean[][] estado0() {
		boolean[][] estado0= {{true,true,true,false},
							  {false,true,false,true},
							  {true,true,false,false},
							  {false,true,true,true}};
		return estado0;
	}
	//cambia el estado de la luz pasada por parametro
	private void cambiarEstadoLuz(int fila,int colum) {
		if (this.tabla[fila][colum] ) {
			this.tabla[fila][colum] =false;
		}	
		else {
			this.tabla[fila][colum] =true;
		}	
	}
}
