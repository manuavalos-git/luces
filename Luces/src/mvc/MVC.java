package mvc;


import java.awt.EventQueue;

import javax.swing.UIManager;

import Interfaz.Usuario;
import control.Controlador;
import servicio.Tablero;

public class MVC {

	public static void main(String[] args) {
		//inicializo objetos
		Usuario usuario=new Usuario();
		Tablero tablero=new Tablero();
		Controlador controlador=new Controlador(usuario, tablero);
		
		try
		 {
		//cambio el LookAndFeel
		 UIManager.setLookAndFeel(
		 UIManager.getSystemLookAndFeelClassName());
		 }
		catch(Exception e) { 
			e.printStackTrace();
		} 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//inicia el cotrolador
					controlador.iniciarControlador();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
