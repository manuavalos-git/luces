package mvc;


import java.awt.EventQueue;

import Interfaz.Usuario;
import control.Controlador;
import servicios.Tablero;

public class MVC {

	public static void main(String[] args) {
		Usuario usuario=new Usuario();
		Tablero tablero=new Tablero(4);
		Controlador controlador=new Controlador(usuario, tablero);
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					controlador.getUsuario().getFrame().setVisible(true);
					controlador.iniciarControlador();
//					while(controlador.getTablero().faltaResolver()) {
//						controlador.checkJuego()
//					}
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
}
