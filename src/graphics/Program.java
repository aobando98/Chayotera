package graphics;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Choice;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Label;

public class Program extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Program frame = new Program();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Program() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 50, 1000, 1050);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		int Percentage = 70;
		int Time = 1;
		int Objective = 10;
		
		Canvas canvas = new Canvas();
		sl_contentPane.putConstraint(SpringLayout.WEST, canvas, 10, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, canvas, -93, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, canvas, -52, SpringLayout.EAST, contentPane);
		canvas.setBackground(Color.ORANGE);
		contentPane.add(canvas);
		
		JLabel lblCantidadDeChayotes = new JLabel("Cantidad de Chayotes: ");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblCantidadDeChayotes, 10, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblCantidadDeChayotes, 10, SpringLayout.WEST, contentPane);
		contentPane.add(lblCantidadDeChayotes);
		
		JComboBox comboBox_Cant = new JComboBox();
		sl_contentPane.putConstraint(SpringLayout.NORTH, comboBox_Cant, 0, SpringLayout.NORTH, lblCantidadDeChayotes);
		sl_contentPane.putConstraint(SpringLayout.WEST, comboBox_Cant, 1, SpringLayout.EAST, lblCantidadDeChayotes);
		while (Objective <= 30){
			comboBox_Cant.addItem(Objective);
			Objective++;
		}
		contentPane.add(comboBox_Cant);
		
		JLabel lblProbabilidadDeNacimiento = new JLabel("Probabilidad de Nacimiento: ");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblProbabilidadDeNacimiento, 0, SpringLayout.NORTH, lblCantidadDeChayotes);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblProbabilidadDeNacimiento, 20, SpringLayout.EAST, comboBox_Cant);
		contentPane.add(lblProbabilidadDeNacimiento);
		
		JComboBox comboBox_Prob = new JComboBox();
		sl_contentPane.putConstraint(SpringLayout.NORTH, comboBox_Prob, 0, SpringLayout.NORTH, lblCantidadDeChayotes);
		sl_contentPane.putConstraint(SpringLayout.WEST, comboBox_Prob, 6, SpringLayout.EAST, lblProbabilidadDeNacimiento);
		while (Percentage <= 90){
			comboBox_Prob.addItem(Percentage);
			Percentage++;
		}
		contentPane.add(comboBox_Prob);
		
		JLabel lblVelocidadDeNacimiento = new JLabel("Velocidad de Nacimiento: ");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblVelocidadDeNacimiento, 0, SpringLayout.NORTH, lblCantidadDeChayotes);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblVelocidadDeNacimiento, 6, SpringLayout.EAST, comboBox_Prob);
		contentPane.add(lblVelocidadDeNacimiento);
		
		JComboBox comboBox_Time = new JComboBox();
		sl_contentPane.putConstraint(SpringLayout.NORTH, comboBox_Time, 0, SpringLayout.NORTH, lblCantidadDeChayotes);
		sl_contentPane.putConstraint(SpringLayout.WEST, comboBox_Time, 6, SpringLayout.EAST, lblVelocidadDeNacimiento);
		while (Time <= 5){
			comboBox_Time.addItem(Time);
			Time++;
		}
		contentPane.add(comboBox_Time);
		
		JButton btnIniciar = new JButton("Iniciar");
		sl_contentPane.putConstraint(SpringLayout.NORTH, canvas, 63, SpringLayout.SOUTH, btnIniciar);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnIniciar, -1, SpringLayout.NORTH, comboBox_Cant);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnIniciar, 13, SpringLayout.EAST, comboBox_Time);
		contentPane.add(btnIniciar);
		
		JLabel lblResultado = new JLabel("Resultado: ");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblResultado, 27, SpringLayout.SOUTH, lblCantidadDeChayotes);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblResultado, 10, SpringLayout.WEST, contentPane);
		contentPane.add(lblResultado);
		
		Label Result_label = new Label("");
		sl_contentPane.putConstraint(SpringLayout.NORTH, Result_label, 0, SpringLayout.NORTH, lblResultado);
		sl_contentPane.putConstraint(SpringLayout.WEST, Result_label, 25, SpringLayout.EAST, lblResultado);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, Result_label, 0, SpringLayout.SOUTH, lblResultado);
		sl_contentPane.putConstraint(SpringLayout.EAST, Result_label, 0, SpringLayout.EAST, comboBox_Cant);
		Result_label.setBackground(Color.LIGHT_GRAY);
		contentPane.add(Result_label);
		
		ImageIcon rama = new ImageIcon("/Users/albertoobando/Documents/workspace/Chayotera/src/images");
	}
}
