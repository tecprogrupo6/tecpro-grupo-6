package paq1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class vf1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCod;
	private JTextField txtCol;
	private JTextField txtTall;
	private JTextField txtNum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vf1 frame = new vf1();
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
	public vf1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("codigo");
		lblNewLabel.setBounds(10, 23, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("talla");
		lblNewLabel_1.setBounds(252, 23, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("color");
		lblNewLabel_2.setBounds(10, 61, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("numero");
		lblNewLabel_3.setBounds(240, 61, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		txtCod = new JTextField();
		txtCod.setBounds(65, 20, 86, 20);
		contentPane.add(txtCod);
		txtCod.setColumns(10);
		
		txtCol = new JTextField();
		txtCol.setBounds(66, 58, 86, 20);
		contentPane.add(txtCol);
		txtCol.setColumns(10);
		
		txtTall = new JTextField();
		txtTall.setBounds(308, 20, 86, 20);
		contentPane.add(txtTall);
		txtTall.setColumns(10);
		
		txtNum = new JTextField();
		txtNum.setBounds(308, 58, 86, 20);
		contentPane.add(txtNum);
		txtNum.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(39, 126, 358, 113);
		contentPane.add(scrollPane);
		
		JTextArea txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		JButton btnlistar = new JButton("Listar");
		btnlistar.setBounds(20, 92, 89, 23);
		contentPane.add(btnlistar);
		
		JButton btnEditar = new JButton("editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEditar.setBounds(119, 92, 89, 23);
		contentPane.add(btnEditar);
		
		JButton btnEliminar = new JButton("eliminar");
		btnEliminar.setBounds(223, 92, 89, 23);
		contentPane.add(btnEliminar);
		
		JButton btnModificar = new JButton("modificar");
		btnModificar.setBounds(318, 92, 89, 23);
		contentPane.add(btnModificar);

	}
}


