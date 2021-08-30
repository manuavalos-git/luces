package Interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.SwingConstants;

public class Usuario {

	private JFrame frame;
	private JTable table;
//

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Usuario window = new Usuario();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Usuario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		iniciarFila0(panel);
		iniciarFila1(panel);
		iniciarFila2(panel);
		iniciarFila3(panel);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Usuario.class.getResource("/recursos/logo.png")));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Monospaced", lblNewLabel.getFont().getStyle(), lblNewLabel.getFont().getSize() + 7));
		lblNewLabel.setAlignmentY(Component.TOP_ALIGNMENT);
		lblNewLabel.setLocation(524, 37);
		lblNewLabel.setSize(50, 288);
		panel.add(lblNewLabel);
		
	}
	private void iniciarFila3(JPanel panel) {
		JRadioButton boton30 = new JRadioButton(new ImageIcon(Usuario.class.getResource("/recursos/apagada.png")));
		boton30.setBounds(28, 280, 45, 45);
		boton30.setName("30");
		boton30.setSelectedIcon(new ImageIcon(Usuario.class.getResource("/recursos/prendida.png")));
		boton30.setBackground(Color.DARK_GRAY);
		panel.add(boton30);
		
		JRadioButton boton31 = new JRadioButton(new ImageIcon(Usuario.class.getResource("/recursos/apagada.png")));
		boton31.setBounds(128, 280, 45, 45);
		boton31.setName("31");
		boton31.setSelectedIcon(new ImageIcon(Usuario.class.getResource("/recursos/prendida.png")));
		boton31.setBackground(Color.DARK_GRAY);
		panel.add(boton31);
		
		JRadioButton boton32 = new JRadioButton(new ImageIcon(Usuario.class.getResource("/recursos/apagada.png")));
		boton32.setBounds(228, 280, 45, 45);
		boton32.setSelectedIcon(new ImageIcon(Usuario.class.getResource("/recursos/prendida.png")));
		boton32.setName("32");
		boton32.setBackground(Color.DARK_GRAY);
		panel.add(boton32);
		
		JRadioButton boton33 = new JRadioButton(new ImageIcon(Usuario.class.getResource("/recursos/apagada.png")));
		boton33.setBounds(328, 280, 45, 45);
		boton33.setSelectedIcon(new ImageIcon(Usuario.class.getResource("/recursos/prendida.png")));
		boton33.setName("33");
		boton33.setBackground(Color.DARK_GRAY);
		panel.add(boton33);
		
	}
	private void iniciarFila2(JPanel panel) {
		JRadioButton boton20 = new JRadioButton(new ImageIcon(Usuario.class.getResource("/recursos/apagada.png")));
		boton20.setBounds(28, 210, 45, 45);
		boton20.setName("20");
		boton20.setSelectedIcon(new ImageIcon(Usuario.class.getResource("/recursos/prendida.png")));
		boton20.setBackground(Color.DARK_GRAY);
		panel.add(boton20);
		
		JRadioButton boton21 = new JRadioButton(new ImageIcon(Usuario.class.getResource("/recursos/apagada.png")));
		boton21.setBounds(128, 210, 45, 45);
		boton21.setName("21");
		boton21.setSelectedIcon(new ImageIcon(Usuario.class.getResource("/recursos/prendida.png")));
		boton21.setBackground(Color.DARK_GRAY);
		panel.add(boton21);
		
		JRadioButton boton22 = new JRadioButton(new ImageIcon(Usuario.class.getResource("/recursos/apagada.png")));
		boton22.setBounds(228, 210, 45, 45);
		boton22.setSelectedIcon(new ImageIcon(Usuario.class.getResource("/recursos/prendida.png")));
		boton22.setName("22");
		boton22.setBackground(Color.DARK_GRAY);
		panel.add(boton22);
		
		JRadioButton boton23 = new JRadioButton(new ImageIcon(Usuario.class.getResource("/recursos/apagada.png")));
		boton23.setBounds(328, 210, 45, 45);
		boton23.setSelectedIcon(new ImageIcon(Usuario.class.getResource("/recursos/prendida.png")));
		boton23.setName("23");
		boton23.setBackground(Color.DARK_GRAY);
		panel.add(boton23);
		
	}

	private void iniciarFila1(JPanel panel) {
		JRadioButton boton10 = new JRadioButton(new ImageIcon(Usuario.class.getResource("/recursos/apagada.png")));
		boton10.setBounds(28, 140, 45, 45);
		boton10.setName("10");
		boton10.setSelectedIcon(new ImageIcon(Usuario.class.getResource("/recursos/prendida.png")));
		boton10.setBackground(Color.DARK_GRAY);
		panel.add(boton10);
		
		JRadioButton boton11 = new JRadioButton(new ImageIcon(Usuario.class.getResource("/recursos/apagada.png")));
		boton11.setBounds(128, 140, 45, 45);
		boton11.setName("11");
		boton11.setSelectedIcon(new ImageIcon(Usuario.class.getResource("/recursos/prendida.png")));
		boton11.setBackground(Color.DARK_GRAY);
		panel.add(boton11);
		
		JRadioButton boton12 = new JRadioButton(new ImageIcon(Usuario.class.getResource("/recursos/apagada.png")));
		boton12.setBounds(228, 140, 45, 45);
		boton12.setSelectedIcon(new ImageIcon(Usuario.class.getResource("/recursos/prendida.png")));
		boton12.setName("12");
		boton12.setBackground(Color.DARK_GRAY);
		panel.add(boton12);
		
		JRadioButton boton13 = new JRadioButton(new ImageIcon(Usuario.class.getResource("/recursos/apagada.png")));
		boton13.setBounds(328, 140, 45, 45);
		boton13.setSelectedIcon(new ImageIcon(Usuario.class.getResource("/recursos/prendida.png")));
		boton13.setName("13");
		boton13.setBackground(Color.DARK_GRAY);
		panel.add(boton13);
		
	}

	private void iniciarFila0(JPanel panel) {
		JRadioButton boton0 = new JRadioButton(new ImageIcon(Usuario.class.getResource("/recursos/apagada.png")));
		boton0.setBounds(28, 70, 45, 45);
		boton0.setName("0");
		boton0.setSelectedIcon(new ImageIcon(Usuario.class.getResource("/recursos/prendida.png")));
		boton0.setBackground(Color.DARK_GRAY);
		panel.add(boton0);
		
		JRadioButton boton1 = new JRadioButton(new ImageIcon(Usuario.class.getResource("/recursos/apagada.png")));
		boton1.setBounds(128, 70, 45, 45);
		boton1.setName("1");
		boton1.setSelectedIcon(new ImageIcon(Usuario.class.getResource("/recursos/prendida.png")));
		boton1.setBackground(Color.DARK_GRAY);
		panel.add(boton1);
		
		JRadioButton boton2 = new JRadioButton(new ImageIcon(Usuario.class.getResource("/recursos/apagada.png")));
		boton2.setBounds(228, 70, 45, 45);
		boton2.setSelectedIcon(new ImageIcon(Usuario.class.getResource("/recursos/prendida.png")));
		boton2.setName("2");
		boton2.setBackground(Color.DARK_GRAY);
		panel.add(boton2);
		
		JRadioButton boton3 = new JRadioButton(new ImageIcon(Usuario.class.getResource("/recursos/apagada.png")));
		boton3.setBounds(328, 70, 45, 45);
		boton3.setSelectedIcon(new ImageIcon(Usuario.class.getResource("/recursos/prendida.png")));
		boton3.setName("3");
		boton3.setBackground(Color.DARK_GRAY);
		panel.add(boton3);
	}
}
