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

public class CadastroFornecedor extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroFornecedor frame = new CadastroFornecedor();
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
	public CadastroFornecedor() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setModalExclusionType(ModalExclusionType.TOOLKIT_EXCLUDE);
		setResizable(false);
		setTitle("Cadastro de Fornecedor");
		setBounds(100, 100, 613, 448);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.controlShadow);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Fornecedor");
		lblNewLabel.setBounds(111, 28, 110, 14);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(111, 49, 306, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 107, 151, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Marca :");
		lblNewLabel_1.setBounds(10, 88, 46, 14);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(10, 405, 631, -211);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setEnabled(false);
		table.setRowSelectionAllowed(false);
		table.setBounds(10, 138, 580, 266);
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
		
		JLabel lblNewLabel_6 = new JLabel("ID:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setBounds(10, 16, 46, 39);
		contentPane.add(lblNewLabel_6);
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_2.setEditable(false);
		textField_2.setBounds(10, 49, 91, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton(new ImageIcon(getClass().getResource("/Imagens/Lupa.png")));
		btnNewButton.setBounds(427, 49, 27, 20);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Salvar",new ImageIcon(getClass().getResource("/Imagens/Salvar.png")));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(351, 97, 110, 30);
		contentPane.add(btnNewButton_1);
		
		JButton btnAlterar = new JButton("Alterar",new ImageIcon(getClass().getResource("/Imagens/Alterar.png")));
		btnAlterar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAlterar.setBounds(480, 97, 110, 30);
		contentPane.add(btnAlterar);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(179, 107, 151, 20);
		contentPane.add(textField_3);
		
		JLabel lblCategoria = new JLabel("Categoria :");
		lblCategoria.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCategoria.setBounds(179, 88, 103, 14);
		contentPane.add(lblCategoria);
		
		JButton btnSair = new JButton("Sair",new ImageIcon(getClass().getResource("/Imagens/Logout.png")));
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				 new CadastroProduto().show();
			}
		});
		btnSair.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSair.setBounds(480, 37, 110, 40);
		contentPane.add(btnSair);
		table.getColumnModel().getColumn(0).setPreferredWidth(29);
		table.getColumnModel().getColumn(1).setPreferredWidth(203);
		table.getColumnModel().getColumn(3).setPreferredWidth(134);
		table.getColumnModel().getColumn(4).setPreferredWidth(181);
	}
}
