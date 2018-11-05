package jogo;

import java.awt.EventQueue;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame {

	private JFrame frame;
	private JTextField resposta;
	private int magico;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame window = new Frame();
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
	public Frame() {
		JOptionPane.showMessageDialog(frame, "Qual é o número mágico?");
		Random gerador = new Random();
		magico = gerador.nextInt(1001);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(Color.WHITE);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(80,250, 600, 80);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 8, 8));
		frame.setTitle("Jogo do Número Magico");
		resposta = new JTextField();
		frame.getContentPane().add(resposta);
		resposta.setColumns(10);
		
		JButton btnConfirmar = new JButton("Confirmar");
	
				
				
				
				
	
		frame.getContentPane().add(btnConfirmar);
		
		JRadioButton rdbtnFacil = new JRadioButton("Fácil");
		
		JRadioButton rdbtnMedio = new JRadioButton("Médio");

		JRadioButton rdbtnDificil = new JRadioButton("Difícil");

		JRadioButton rdbtnMuitodificil = new JRadioButton("MuitoDifícil");

		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnFacil);
		bg.add(rdbtnMedio);
		bg.add(rdbtnDificil);
		bg.add(rdbtnMuitodificil);
		frame.getContentPane().add(rdbtnFacil);
		frame.getContentPane().add(rdbtnMedio);
		frame.getContentPane().add(rdbtnDificil);
		frame.getContentPane().add(rdbtnMuitodificil);
	
		rdbtnMedio.setSelected(true);;
		btnConfirmar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				if(Integer.parseInt(resposta.getText())==magico) {
					resposta.setBackground(Color.GREEN);
					JOptionPane.showMessageDialog(frame,"Resposta Certa!");
					int dialogButton = JOptionPane.YES_NO_OPTION;
					int dialogResult = JOptionPane.showConfirmDialog(null, "Deseja Jogar de novo?","Atenção!",dialogButton);
					if(dialogResult == JOptionPane.YES_OPTION) {
						frame.setVisible(false);
						frame.dispose();
						main(null);
					}
					else {
						JOptionPane.showMessageDialog(frame,"Obrigado por jogar!");
						frame.setVisible(false);
						frame.dispose();
					}
				}
				if(rdbtnMuitodificil.isSelected()) {
					if(Integer.parseInt(resposta.getText())!=magico) {
						resposta.setBackground(Color.RED);
						JOptionPane.showMessageDialog(frame,"Resposta Errada!");
				
					}
					
				}
				if(rdbtnDificil.isSelected()) {
					if(Integer.parseInt(resposta.getText())>magico) {
						resposta.setBackground(Color.RED);
						JOptionPane.showMessageDialog(frame,"Resposta muito alta!");
				}
					if(Integer.parseInt(resposta.getText())<magico){
						resposta.setBackground(Color.RED);
						JOptionPane.showMessageDialog(frame,"Resposta muito baixa!");
						
					}		
				}
				if(rdbtnMedio.isSelected()) {
					if(Integer.parseInt(resposta.getText())>magico+100) {
						resposta.setBackground(Color.RED);
						JOptionPane.showMessageDialog(frame,"Resposta muito alta!");						
					}
					else if(Integer.parseInt(resposta.getText())<magico-100){
						resposta.setBackground(Color.RED);
						JOptionPane.showMessageDialog(frame,"Resposta muito baixa!");
					}	
					else if(Integer.parseInt(resposta.getText())>magico){
						resposta.setBackground(Color.ORANGE);
						JOptionPane.showMessageDialog(frame,"Resposta alta!");
						
					}	
					else if(Integer.parseInt(resposta.getText())<magico){
						resposta.setBackground(Color.ORANGE);
						JOptionPane.showMessageDialog(frame,"Resposta baixa!");
					}	
				}
				if(rdbtnFacil.isSelected()) {
					if(Integer.parseInt(resposta.getText())>magico+100) {
						resposta.setBackground(Color.RED);
						JOptionPane.showMessageDialog(frame,"Resposta muito alta!");
					}
					else if(Integer.parseInt(resposta.getText())<magico-100){
						resposta.setBackground(Color.RED);
						JOptionPane.showMessageDialog(frame,"Resposta muito baixa!");
					}	
					else if(Integer.parseInt(resposta.getText())>magico+50){
						resposta.setBackground(Color.ORANGE);
						JOptionPane.showMessageDialog(frame,"Resposta alta!");
					}	
					else if(Integer.parseInt(resposta.getText())<magico-50){
						resposta.setBackground(Color.ORANGE);
						JOptionPane.showMessageDialog(frame,"Resposta baixa!");
					}
					else if(Integer.parseInt(resposta.getText())>magico){
						resposta.setBackground(Color.YELLOW);
						JOptionPane.showMessageDialog(frame,"Resposta pouco alta!");
					
					}	
					else if(Integer.parseInt(resposta.getText())<magico){
						resposta.setBackground(Color.YELLOW);
						JOptionPane.showMessageDialog(frame,"Resposta pouco baixa!");
					}	
				
				}
				}
			});
	}

}
