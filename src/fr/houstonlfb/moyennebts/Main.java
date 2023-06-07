package fr.houstonlfb.moyennebts;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Font;

@SuppressWarnings({"unused",})
public class Main extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6258303448707336946L;
	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField txtCalculEstimationNote;
	private JTextField txtNeRienMettre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
					frame.setTitle("Moyenne BTS");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 492);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(135, 77, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		// LE BOUTON EST ICI -----------------
		JButton btnNewButton = new JButton("Calculer");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				float opt = 0;
				
				if (!textField_1.getText().isEmpty()) {
					opt = Float.parseFloat(textField_1.getText());
				}
				
				float math = Float.parseFloat(textField.getText());
				float cult = Float.parseFloat(textField_2.getText());
				float ecrit = Float.parseFloat(textField_3.getText());
				float oral = Float.parseFloat(textField_4.getText());
				float cejm = Float.parseFloat(textField_5.getText());
				float e4 = Float.parseFloat(textField_6.getText());
				float e5 = Float.parseFloat(textField_7.getText());
				float e6 = Float.parseFloat(textField_8.getText());
				
				float note;
				
				if (opt < 10) {
					note = math * 3 + cult * 2 + ecrit + oral + cejm * 3 + e4 * 4 + e5 * 4 + e6 * 4; 
					note = note / 22;
				} else {
					note = math * 3 + cult * 2 + ecrit + oral + cejm * 3 + e4 * 4 + e5 * 4 + e6 * 4 + opt; 
					note = note / 22;
				}
				
				
				if (note>20) {
					note = 20;
				}
				
				String noteS = Float.toString(note);
				
				textField_9.setText(noteS);
			}
		});
		
		

		btnNewButton.setBounds(23, 379, 89, 23);
		contentPane.add(btnNewButton);
		
		JTextArea txtrMath = new JTextArea();
		txtrMath.setEditable(false);
		txtrMath.setText("Math option");
		txtrMath.setBounds(23, 111, 93, 22);
		contentPane.add(txtrMath);
		
		JTextArea txtrMath_1 = new JTextArea();
		txtrMath_1.setEditable(false);
		txtrMath_1.setText("Math");
		txtrMath_1.setBounds(23, 75, 37, 22);
		contentPane.add(txtrMath_1);
		
		JTextArea txtrCultureG = new JTextArea();
		txtrCultureG.setEditable(false);
		txtrCultureG.setText("Culture G");
		txtrCultureG.setBounds(23, 148, 93, 22);
		contentPane.add(txtrCultureG);
		
		JTextArea txtrAnglaiscrit = new JTextArea();
		txtrAnglaiscrit.setEditable(false);
		txtrAnglaiscrit.setText("Anglais écrit");
		txtrAnglaiscrit.setBounds(23, 181, 93, 22);
		contentPane.add(txtrAnglaiscrit);
		
		JTextArea txtrAnglaisOral = new JTextArea();
		txtrAnglaisOral.setEditable(false);
		txtrAnglaisOral.setText("Anglais oral");
		txtrAnglaisOral.setBounds(23, 214, 93, 22);
		contentPane.add(txtrAnglaisOral);
		
		JTextArea txtrCejm = new JTextArea();
		txtrCejm.setEditable(false);
		txtrCejm.setText("CEJM");
		txtrCejm.setBounds(23, 247, 93, 22);
		contentPane.add(txtrCejm);
		
		JTextArea txtrE = new JTextArea();
		txtrE.setEditable(false);
		txtrE.setText("E4");
		txtrE.setBounds(23, 280, 93, 22);
		contentPane.add(txtrE);
		
		JTextArea txtrE_2 = new JTextArea();
		txtrE_2.setEditable(false);
		txtrE_2.setText("E5");
		txtrE_2.setBounds(23, 313, 93, 22);
		contentPane.add(txtrE_2);
		
		JTextArea txtrE_1_1 = new JTextArea();
		txtrE_1_1.setEditable(false);
		txtrE_1_1.setText("E6");
		txtrE_1_1.setBounds(23, 346, 93, 22);
		contentPane.add(txtrE_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(135, 113, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(135, 150, 86, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(135, 183, 86, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(135, 216, 86, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(135, 249, 86, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(135, 282, 86, 20);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(135, 315, 86, 20);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(135, 348, 86, 20);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBounds(135, 422, 86, 20);
		contentPane.add(textField_9);
		
		JTextArea txtrE_1_1_1 = new JTextArea();
		txtrE_1_1_1.setText("Note :");
		txtrE_1_1_1.setBounds(23, 420, 93, 22);
		contentPane.add(txtrE_1_1_1);
		
		txtCalculEstimationNote = new JTextField();
		txtCalculEstimationNote.setEditable(false);
		txtCalculEstimationNote.setFont(new Font("Tahoma", Font.PLAIN, 19));
		txtCalculEstimationNote.setText("Calcul estimation note BTS");
		txtCalculEstimationNote.setBounds(23, 0, 287, 50);
		contentPane.add(txtCalculEstimationNote);
		txtCalculEstimationNote.setColumns(10);
		
		txtNeRienMettre = new JTextField();
		txtNeRienMettre.setEditable(false);
		txtNeRienMettre.setFont(new Font("Tahoma", Font.ITALIC, 11));
		txtNeRienMettre.setText("Ne rien mettre dans Math Option si vous faites pas. Pour les nombres décimaux, c'est un point (.) pas une virgule (,).");
		txtNeRienMettre.setBounds(23, 41, 611, 33);
		contentPane.add(txtNeRienMettre);
		txtNeRienMettre.setColumns(10);
	}
}
