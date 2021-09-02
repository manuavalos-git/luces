package control;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

import Interfaz.Usuario;
import servicios.Tablero;

public class Controlador  {
	private Usuario usuario;
	private Tablero tablero;
	private JRadioButton[][] botones;
	private int intentos;
	
	
	public Controlador(Usuario usuario,Tablero tablero) {
		this.usuario=usuario;
		this.tablero=tablero;
	}
	public void iniciarControlador() {
		//hago visible el frame
		this.usuario.getFrame().setVisible(true);
		//cargo los botones a una matriz
		asignarBotones();
		//prendo las luces en el tablero
		this.tablero.prenderLuzInicio();
		//prendo las luces en los botones
		prenderLuzInicioBotones();
		//controla que luz o boton es pulsado
		controlListener();
				
	}
	public void iniciarControladorReinicio() {
				//cargo los botones a una matriz
				asignarBotones();
				//prendo las luces en el tablero
				this.tablero.prenderLuzInicio();
				//prendo las luces en los botones
				prenderLuzInicioBotones();
	}
	private void controlListener() {
		controlJugar();
		controlReiniciar();
		controlBoton0();
		controlBoton1();
		controlBoton2();
		controlBoton3();
		controlBoton10();
		controlBoton11();
		controlBoton12();
		controlBoton13();
		controlBoton20();
		controlBoton21();
		controlBoton22();
		controlBoton23();
		controlBoton30();
		controlBoton31();
		controlBoton32();
		controlBoton33();
	}
	private void mostrarFocos() {
		usuario.getBoton0().setVisible(true);
		usuario.getBoton1().setVisible(true);
		usuario.getBoton2().setVisible(true);
		usuario.getBoton3().setVisible(true);
		usuario.getBoton10().setVisible(true);
		usuario.getBoton11().setVisible(true);
		usuario.getBoton12().setVisible(true);
		usuario.getBoton13().setVisible(true);
		usuario.getBoton20().setVisible(true);
		usuario.getBoton21().setVisible(true);
		usuario.getBoton22().setVisible(true);
		usuario.getBoton23().setVisible(true);
		usuario.getBoton30().setVisible(true);
		usuario.getBoton31().setVisible(true);
		usuario.getBoton32().setVisible(true);
		usuario.getBoton33().setVisible(true);
	}
	private void habilitarFocos() {
		usuario.getBoton0().setEnabled(true);
		usuario.getBoton1().setEnabled(true);
		usuario.getBoton2().setEnabled(true);
		usuario.getBoton3().setEnabled(true);
		usuario.getBoton10().setEnabled(true);
		usuario.getBoton11().setEnabled(true);
		usuario.getBoton12().setEnabled(true);
		usuario.getBoton13().setEnabled(true);
		usuario.getBoton20().setEnabled(true);
		usuario.getBoton21().setEnabled(true);
		usuario.getBoton22().setEnabled(true);
		usuario.getBoton23().setEnabled(true);
		usuario.getBoton30().setEnabled(true);
		usuario.getBoton31().setEnabled(true);
		usuario.getBoton32().setEnabled(true);
		usuario.getBoton33().setEnabled(true);
	}
	private void controlReiniciar() {
		
		ActionListener bR=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				intentos=0;
				usuario.getIntentos().setText("Intentos : "+ intentos);
				if(!tablero.faltaResolver()) {
					usuario.getGanaste().setVisible(false);
					mostrarFocos();
				}
				iniciarControladorReinicio();
			}
			
		};
		this.usuario.getBtnReiniciar().addActionListener(bR);
	}
	private void controlJugar() {
		ActionListener bJ=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//habilito los focos
				mostrarFocos();
				habilitarFocos();
				//oculto instrucciones
				usuario.getIntrucciones().setVisible(false);
				//habilito boton reiniciar
				usuario.getBtnReiniciar().setVisible(true);
				usuario.getBtnReiniciar().setEnabled(true);
				//deshabilito boton jugar
				usuario.getBtnJugar().setVisible(false);
				usuario.getBtnJugar().setEnabled(false);
				//muestro contador
				intentos=0;
				usuario.getIntentos().setVisible(true);
				usuario.getIntentos().setText("Intentos : "+ intentos);
			}
		};
		this.usuario.getBtnJugar().addActionListener(bJ);
	}
	private void controlBoton0() {
		ActionListener b0=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tablero.click(0, 0);
				click(0, 0);
				checkJuego();
				intentos++;
				usuario.getIntentos().setText("Intentos : "+ intentos);
			}
		};
		this.usuario.getBoton0().addActionListener(b0);
	}
	private void controlBoton1() {
		ActionListener b1=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tablero.click(0, 1);
				click(0, 1);
				checkJuego();
				intentos++;
				usuario.getIntentos().setText("Intentos : "+ intentos);
			}
		};
		this.usuario.getBoton1().addActionListener(b1);
	}
	private void controlBoton2() {
		ActionListener b2=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tablero.click(0, 2);
				click(0, 2);
				checkJuego();
				intentos++;
				usuario.getIntentos().setText("Intentos : "+ intentos);
			}
		};
		this.usuario.getBoton2().addActionListener(b2);
	}
	private void controlBoton3() {
		ActionListener b3=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tablero.click(0, 3);
				click(0, 3);
				checkJuego();
				intentos++;
				usuario.getIntentos().setText("Intentos : "+ intentos);
			}
		};
		this.usuario.getBoton3().addActionListener(b3);
	}
	private void controlBoton10() {
		ActionListener b10=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tablero.click(1, 0);
				click(1, 0);
				checkJuego();
				intentos++;
				usuario.getIntentos().setText("Intentos : "+ intentos);
			}
		};
		this.usuario.getBoton10().addActionListener(b10);
	}
	private void controlBoton11() {
		ActionListener b11=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tablero.click(1, 1);
				click(1, 1);
				checkJuego();
				intentos++;
				usuario.getIntentos().setText("Intentos : "+ intentos);
			}
		};
		this.usuario.getBoton11().addActionListener(b11);
	}
	private void controlBoton12() {
		ActionListener b12=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tablero.click(1, 2);
				click(1, 2);
				checkJuego();
				intentos++;
				usuario.getIntentos().setText("Intentos : "+ intentos);
			}
		};
		this.usuario.getBoton12().addActionListener(b12);
	}
	private void controlBoton13() {
		ActionListener b13=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tablero.click(1, 3);
				click(1, 3);
				checkJuego();
				intentos++;
				usuario.getIntentos().setText("Intentos : "+ intentos);
			}
		};
		this.usuario.getBoton13().addActionListener(b13);
	}
	private void controlBoton20() {
		ActionListener b20=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tablero.click(2, 0);
				click(2, 0);
				checkJuego();
				intentos++;
				usuario.getIntentos().setText("Intentos : "+ intentos);
			}
		};
		this.usuario.getBoton20().addActionListener(b20);
	}
	private void controlBoton21() {
		ActionListener b21=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tablero.click(2, 1);
				click(2, 1);
				checkJuego();
				intentos++;
				usuario.getIntentos().setText("Intentos : "+ intentos);
			}
		};
		this.usuario.getBoton21().addActionListener(b21);
	}
	private void controlBoton22() {
		ActionListener b22=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tablero.click(2, 2);
				click(2, 2);
				checkJuego();
				intentos++;
				usuario.getIntentos().setText("Intentos : "+ intentos);
			}
		};
		this.usuario.getBoton22().addActionListener(b22);
	}
	private void controlBoton23() {
		ActionListener b23=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tablero.click(2, 3);
				click(2, 3);
				checkJuego();
				intentos++;
				usuario.getIntentos().setText("Intentos : "+ intentos);
			}
		};
		this.usuario.getBoton23().addActionListener(b23);
	}
	private void controlBoton30() {
		ActionListener b30=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tablero.click(3, 0);
				click(3, 0);
				checkJuego();
				intentos++;
				usuario.getIntentos().setText("Intentos : "+ intentos);
			}
		};
		this.usuario.getBoton30().addActionListener(b30);
	}
	private void controlBoton31() {
		ActionListener b31=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tablero.click(3, 1);
				click(3, 1);
				checkJuego();
				intentos++;
				usuario.getIntentos().setText("Intentos : "+ intentos);
			}
		};
		this.usuario.getBoton31().addActionListener(b31);
	}
	private void controlBoton32() {
		ActionListener b32=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tablero.click(3, 2);
				click(3, 2);
				checkJuego();
				intentos++;
				usuario.getIntentos().setText("Intentos : "+ intentos);
			}
		};
		this.usuario.getBoton32().addActionListener(b32);
	}
	private void controlBoton33() {
		ActionListener b33=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tablero.click(3, 3);
				click(3, 3);
				checkJuego();
				intentos++;
				usuario.getIntentos().setText("Intentos : "+ intentos);
			}
		};
		this.usuario.getBoton33().addActionListener(b33);
	}
	private void prenderLuzInicioBotones() {
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				this.botones[i][j].setSelected(this.tablero.getEstado(i, j));
			}	
		}
	}
	private void click(int fila,int colum){
		int filasYColum=4;
			if(fila>0 && fila<filasYColum-1 && colum>0 && colum<filasYColum-1) {
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
			else if(fila==filasYColum-1 ) {
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
	private void cambiarEstadoLuz(int fila, int colum) {
		if (this.botones[fila][colum].isSelected() ) {
			this.botones[fila][colum].setSelected(false);
		}	
		else {
			this.botones[fila][colum].setSelected(true);
		}	
		
	}
	private void asignarBotones() {
		this.botones=new JRadioButton[4][4];
		this.botones[0][0]=this.usuario.getBoton0();
		this.botones[0][1]=this.usuario.getBoton1();
		this.botones[0][2]=this.usuario.getBoton2();
		this.botones[0][3]=this.usuario.getBoton3();
		this.botones[1][0]=this.usuario.getBoton10();
		this.botones[1][1]=this.usuario.getBoton11();
		this.botones[1][2]=this.usuario.getBoton12();
		this.botones[1][3]=this.usuario.getBoton13();
		this.botones[2][0]=this.usuario.getBoton20();
		this.botones[2][1]=this.usuario.getBoton21();
		this.botones[2][2]=this.usuario.getBoton22();
		this.botones[2][3]=this.usuario.getBoton23();
		this.botones[3][0]=this.usuario.getBoton30();
		this.botones[3][1]=this.usuario.getBoton31();
		this.botones[3][2]=this.usuario.getBoton32();
		this.botones[3][3]=this.usuario.getBoton33();
	}
	private void checkJuego() {
		if(!this.tablero.faltaResolver()) {
			finDelJuego();	
		}
	}
	private void finDelJuego() {
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				this.botones[i][j].setVisible(false);
			}
		}
		//poner cartel
		this.usuario.getGanaste().setVisible(true);
	}
}
