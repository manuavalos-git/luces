package Interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class Usuario {
	private JFrame frame;
	private JRadioButton boton30,boton31,boton32,boton33,
						boton20,boton21,boton22,boton23,
						boton10,boton11,boton12,boton13,
						boton0,boton1,boton2,boton3;
	private JPanel panel;
	private JButton btnJugar;
	private JLabel intrucciones, ganaste ,intentos;
	private JButton btnReiniciar;


	public Usuario() {
		initialize();
	}
	
	public JLabel getIntentos() {
		return intentos;
	}

	public JLabel getGanaste() {
		return ganaste;
	}

	public JButton getBtnJugar() {
		return btnJugar;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
	
	public JFrame getFrame() {
		return frame;
	}
	
	public JPanel getPanel() {
		return panel;
	}

	public JRadioButton getBoton30() {
		return boton30;
	}

	public JRadioButton getBoton31() {
		return boton31;
	}

	public JRadioButton getBoton32() {
		return boton32;
	}

	public JRadioButton getBoton33() {
		return boton33;
	}

	public JRadioButton getBoton20() {
		return boton20;
	}

	public JRadioButton getBoton21() {
		return boton21;
	}

	public JRadioButton getBoton22() {
		return boton22;
	}

	public JRadioButton getBoton23() {
		return boton23;
	}

	public JRadioButton getBoton10() {
		return boton10;
	}

	public JRadioButton getBoton11() {
		return boton11;
	}

	public JRadioButton getBoton12() {
		return boton12;
	}

	public JRadioButton getBoton13() {
		return boton13;
	}

	public JRadioButton getBoton0() {
		return boton0;
	}

	public JRadioButton getBoton1() {
		return boton1;
	}

	public JRadioButton getBoton2() {
		return boton2;
	}

	public JRadioButton getBoton3() {
		return boton3;
	}
	
	public JButton getBtnReiniciar() {
		return btnReiniciar;
	}

	public JLabel getIntrucciones() {
		return intrucciones;
	}
	
	private void initialize() {
		setFrame(new JFrame());
		getFrame().setBounds(100, 100, 600, 400);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		getFrame().getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Usuario.class.getResource("/recursos/logo.png")));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Monospaced", lblNewLabel.getFont().getStyle(), lblNewLabel.getFont().getSize() + 7));
		lblNewLabel.setAlignmentY(Component.TOP_ALIGNMENT);
		lblNewLabel.setLocation(524, 37);
		lblNewLabel.setSize(50, 288);
		panel.add(lblNewLabel);
		
		intentos= new JLabel("");
		intentos.setVisible(false);
		intentos.setForeground(Color.WHITE);
		intentos.setFont(new Font("Rockwell", Font.BOLD, 16));
		intentos.setBounds(397, 84, 108, 31);
		panel.add(intentos);
		
		intrucciones = new JLabel("");
		intrucciones.setIcon(new ImageIcon(Usuario.class.getResource("/recursos/instruc.png")));
		intrucciones.setBounds(52, 70, 321, 203);
		panel.add(intrucciones);
		
		btnJugar = new JButton("Jugar");
		btnJugar.setFocusPainted(false);
		btnJugar.setBorder(null);
		btnJugar.setBorderPainted(false);
		btnJugar.setBackground(new Color(173, 216, 230));
		btnJugar.setForeground(Color.DARK_GRAY);
		btnJugar.setFont(new Font("Berlin Sans FB", Font.BOLD, 26));
		btnJugar.setBounds(397, 273, 108, 38);
		panel.add(btnJugar);
		
		btnReiniciar = new JButton("Reiniciar");
		btnReiniciar.setFocusPainted(false);
		btnReiniciar.setVisible(false);
		btnReiniciar.setEnabled(false);
		btnReiniciar.setForeground(Color.DARK_GRAY);
		btnReiniciar.setFont(new Font("Berlin Sans FB", Font.BOLD, 26));
		btnReiniciar.setBorder(null);
		btnReiniciar.setBackground(new Color(173, 216, 230));
		btnReiniciar.setBounds(383, 273, 131, 38);
		panel.add(btnReiniciar);
		
		ganaste = new JLabel("");
		ganaste.setVisible(false);
		ganaste.setIcon(new ImageIcon(Usuario.class.getResource("/recursos/ganaste.png")));
		ganaste.setBounds(51, 145, 300, 110);
		panel.add(ganaste);
		
		boton30 = new JRadioButton(new ImageIcon(Usuario.class.getResource("/recursos/apagada.png")));
		boton30.setEnabled(false);
		boton30.setVisible(false);
		boton30.setBounds(28, 280, 45, 45);
		boton30.setName("30");
		boton30.setSelectedIcon(new ImageIcon(Usuario.class.getResource("/recursos/prendida.png")));
		boton30.setBackground(Color.DARK_GRAY);
		panel.add(boton30);
		
		boton31 = new JRadioButton(new ImageIcon(Usuario.class.getResource("/recursos/apagada.png")));
		boton31.setEnabled(false);
		boton31.setVisible(false);
		boton31.setBounds(128, 280, 45, 45);
		boton31.setName("31");
		boton31.setSelectedIcon(new ImageIcon(Usuario.class.getResource("/recursos/prendida.png")));
		boton31.setBackground(Color.DARK_GRAY);
		panel.add(boton31);
		
		boton32 = new JRadioButton(new ImageIcon(Usuario.class.getResource("/recursos/apagada.png")));
		boton32.setEnabled(false);
		boton32.setVisible(false);
		boton32.setBounds(228, 280, 45, 45);
		boton32.setSelectedIcon(new ImageIcon(Usuario.class.getResource("/recursos/prendida.png")));
		boton32.setName("32");
		boton32.setBackground(Color.DARK_GRAY);
		panel.add(boton32);
		
		boton33 = new JRadioButton(new ImageIcon(Usuario.class.getResource("/recursos/apagada.png")));
		boton33.setEnabled(false);
		boton33.setVisible(false);
		boton33.setBounds(328, 280, 45, 45);
		boton33.setSelectedIcon(new ImageIcon(Usuario.class.getResource("/recursos/prendida.png")));
		boton33.setName("33");
		boton33.setBackground(Color.DARK_GRAY);
		panel.add(boton33);
	
		boton20 = new JRadioButton(new ImageIcon(Usuario.class.getResource("/recursos/apagada.png")));
		boton20.setEnabled(false);
		boton20.setVisible(false);
		boton20.setBounds(28, 210, 45, 45);
		boton20.setName("20");
		boton20.setSelectedIcon(new ImageIcon(Usuario.class.getResource("/recursos/prendida.png")));
		boton20.setBackground(Color.DARK_GRAY);
		panel.add(boton20);
		
		boton21 = new JRadioButton(new ImageIcon(Usuario.class.getResource("/recursos/apagada.png")));
		boton21.setEnabled(false);
		boton21.setVisible(false);
		boton21.setBounds(128, 210, 45, 45);
		boton21.setName("21");
		boton21.setSelectedIcon(new ImageIcon(Usuario.class.getResource("/recursos/prendida.png")));
		boton21.setBackground(Color.DARK_GRAY);
		panel.add(boton21);
		
		boton22 = new JRadioButton(new ImageIcon(Usuario.class.getResource("/recursos/apagada.png")));
		boton22.setEnabled(false);
		boton22.setVisible(false);
		boton22.setBounds(228, 210, 45, 45);
		boton22.setSelectedIcon(new ImageIcon(Usuario.class.getResource("/recursos/prendida.png")));
		boton22.setName("22");
		boton22.setBackground(Color.DARK_GRAY);
		panel.add(boton22);
		
		boton23 = new JRadioButton(new ImageIcon(Usuario.class.getResource("/recursos/apagada.png")));
		boton23.setEnabled(false);
		boton23.setVisible(false);
		boton23.setBounds(328, 210, 45, 45);
		boton23.setSelectedIcon(new ImageIcon(Usuario.class.getResource("/recursos/prendida.png")));
		boton23.setName("23");
		boton23.setBackground(Color.DARK_GRAY);
		panel.add(boton23);
	
		boton10 = new JRadioButton(new ImageIcon(Usuario.class.getResource("/recursos/apagada.png")));
		boton10.setEnabled(false);
		boton10.setVisible(false);
		boton10.setBounds(28, 140, 45, 45);
		boton10.setName("10");
		boton10.setSelectedIcon(new ImageIcon(Usuario.class.getResource("/recursos/prendida.png")));
		boton10.setBackground(Color.DARK_GRAY);
		panel.add(boton10);
		
		boton11 = new JRadioButton(new ImageIcon(Usuario.class.getResource("/recursos/apagada.png")));
		boton11.setEnabled(false);
		boton11.setVisible(false);
		boton11.setBounds(128, 140, 45, 45);
		boton11.setName("11");
		boton11.setSelectedIcon(new ImageIcon(Usuario.class.getResource("/recursos/prendida.png")));
		boton11.setBackground(Color.DARK_GRAY);
		panel.add(boton11);
		
		boton12 = new JRadioButton(new ImageIcon(Usuario.class.getResource("/recursos/apagada.png")));
		boton12.setEnabled(false);
		boton12.setVisible(false);
		boton12.setBounds(228, 140, 45, 45);
		boton12.setSelectedIcon(new ImageIcon(Usuario.class.getResource("/recursos/prendida.png")));
		boton12.setName("12");
		boton12.setBackground(Color.DARK_GRAY);
		panel.add(boton12);
		
		boton13 = new JRadioButton(new ImageIcon(Usuario.class.getResource("/recursos/apagada.png")));
		boton13.setEnabled(false);
		boton13.setVisible(false);
		boton13.setBounds(328, 140, 45, 45);
		boton13.setSelectedIcon(new ImageIcon(Usuario.class.getResource("/recursos/prendida.png")));
		boton13.setName("13");
		boton13.setBackground(Color.DARK_GRAY);
		panel.add(boton13);
	
		boton0 = new JRadioButton(new ImageIcon(Usuario.class.getResource("/recursos/apagada.png")));
		boton0.setEnabled(false);
		boton0.setVisible(false);
		boton0.setBounds(28, 70, 45, 45);
		boton0.setName("0");
		boton0.setSelectedIcon(new ImageIcon(Usuario.class.getResource("/recursos/prendida.png")));
		boton0.setBackground(Color.DARK_GRAY);
		panel.add(boton0);
		
		boton1 = new JRadioButton(new ImageIcon(Usuario.class.getResource("/recursos/apagada.png")));
		boton1.setEnabled(false);
		boton1.setVisible(false);
		boton1.setBounds(128, 70, 45, 45);
		boton1.setName("1");
		boton1.setSelectedIcon(new ImageIcon(Usuario.class.getResource("/recursos/prendida.png")));
		boton1.setBackground(Color.DARK_GRAY);
		panel.add(boton1);
		
		boton2 = new JRadioButton(new ImageIcon(Usuario.class.getResource("/recursos/apagada.png")));
		boton2.setEnabled(false);
		boton2.setVisible(false);
		boton2.setBounds(228, 70, 45, 45);
		boton2.setSelectedIcon(new ImageIcon(Usuario.class.getResource("/recursos/prendida.png")));
		boton2.setName("2");
		boton2.setBackground(Color.DARK_GRAY);
		panel.add(boton2);
		
		boton3 = new JRadioButton(new ImageIcon(Usuario.class.getResource("/recursos/apagada.png")));
		boton3.setEnabled(false);
		boton3.setVisible(false);
		boton3.setBounds(328, 70, 45, 45);
		boton3.setSelectedIcon(new ImageIcon(Usuario.class.getResource("/recursos/prendida.png")));
		boton3.setName("3");
		boton3.setBackground(Color.DARK_GRAY);
		panel.add(boton3);
		
	}
}
