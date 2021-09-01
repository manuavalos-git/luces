package control;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	
	public Controlador(Usuario usuario,Tablero tablero) {
		this.usuario=usuario;
		this.tablero=tablero;
	}
	public void iniciarControlador() {
		asignarBotones();
		
				
	}
	private void asignarBotones() {
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

//	@Override
//	public void actionPerformed(ActionEvent e) {
//			JLabel lblNewLabel = new JLabel("");
//			lblNewLabel.setIcon(new ImageIcon(Usuario.class.getResource("/recursos/logo.png")));
//			lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
//			lblNewLabel.setFont(new Font("Monospaced", lblNewLabel.getFont().getStyle(), lblNewLabel.getFont().getSize() + 7));
//			lblNewLabel.setAlignmentY(Component.TOP_ALIGNMENT);
//			lblNewLabel.setLocation(500, 37);
//			lblNewLabel.setSize(50, 288);
//			usuario.getPanel().add(lblNewLabel);
//			lblNewLabel.setVisible(true);
//	}
	
	public Usuario getUsuario() {
		return usuario;
	}
}
