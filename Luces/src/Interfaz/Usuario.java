package Interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;

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
		frame.setBounds(100, 100, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JRadioButton boton1 = new JRadioButton(new ImageIcon(Usuario.class.getResource("/recursos/apagada.png")));
		boton1.setSelectedIcon(new ImageIcon(Usuario.class.getResource("/recursos/prendida.png")));
		boton1.setAlignmentX(Component.CENTER_ALIGNMENT);
		boton1.setMinimumSize(new Dimension(40, 40));
		boton1.setMaximumSize(new Dimension(40, 40));
		boton1.setForeground(Color.WHITE);
		boton1.setBackground(Color.DARK_GRAY);
		boton1.setBounds(71, 131, 45, 40);
		panel.add(boton1);
		
	}
}
