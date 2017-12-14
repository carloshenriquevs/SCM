package Aplicacao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import java.awt.Canvas;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.table.DefaultTableModel;
import javax.xml.transform.Source;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JCheckBox;

public class LiberarRequisito extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LiberarRequisito frame = new LiberarRequisito();
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
	public LiberarRequisito() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setModalExclusionType(ModalExclusionType.TOOLKIT_EXCLUDE);
		setResizable(false);
		setTitle("Liberar Requisi\u00E7\u00F5es");
		setBounds(100, 100, 761, 536);
		
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.controlShadow);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(10, 405, 631, -211);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setEnabled(false);
		table.setRowSelectionAllowed(false);
		table.setBounds(10, 121, 731, 364);
		contentPane.add(table);
		table.setToolTipText("");
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"ID", "NOME", "SENHA", "NIVEL USUARIO", "EMAIL"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		
		JButton btn_UserConsulta =  new JButton(new ImageIcon(getClass().getResource("/Imagens/Lupa.png")));
		btn_UserConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_UserConsulta.setBounds(322, 68, 34, 20);
		contentPane.add(btn_UserConsulta);
		
		JButton btnLiberar = new JButton("Liberar",new ImageIcon(getClass().getResource("/Imagens/Salvar.png")));
		btnLiberar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLiberar.setBounds(393, 70, 110, 40);
		contentPane.add(btnLiberar);
		
		JLabel lblData = new JLabel("Data da Requisi\u00E7\u00F5es :");
		lblData.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblData.setBounds(21, 68, 160, 20);
		contentPane.add(lblData);
		
		textField = new JTextField();
		textField.setBounds(173, 68, 139, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Listar todos do Dia:");
		chckbxNewCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 14));
		chckbxNewCheckBox.setBounds(393, 37, 230, 20);
		contentPane.add(chckbxNewCheckBox);
		
		JLabel lblUusuario = new JLabel("Uusuario :");
		lblUusuario.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblUusuario.setBounds(95, 37, 74, 20);
		contentPane.add(lblUusuario);
		
		textField_1 = new JTextField();
		textField_1.setBounds(173, 37, 139, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnSair = new JButton("Sair",new ImageIcon(getClass().getResource("/Imagens/Logout.png")));
		btnSair.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				 new Menu().show();
			}
		});
		btnSair.setBounds(513, 70, 110, 40);
		contentPane.add(btnSair);
		table.getColumnModel().getColumn(0).setPreferredWidth(29);
		table.getColumnModel().getColumn(1).setPreferredWidth(203);
		table.getColumnModel().getColumn(3).setPreferredWidth(134);
		table.getColumnModel().getColumn(4).setPreferredWidth(181);
		
		
	}
}
