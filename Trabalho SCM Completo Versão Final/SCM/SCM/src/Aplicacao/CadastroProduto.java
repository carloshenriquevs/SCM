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
import javax.swing.Icon;

public class CadastroProduto extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JTable table;
	private JTextField textField_2;
	private JPasswordField passwordField_1;

	CadastroFornecedor cadastroFornecedor = new CadastroFornecedor();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroProduto frame = new CadastroProduto();
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
	public CadastroProduto() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setModalExclusionType(ModalExclusionType.TOOLKIT_EXCLUDE);
		setResizable(false);
		setTitle("Cadastro de Material");
		setBounds(100, 100, 689, 526);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.controlShadow);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome Produto:");
		lblNewLabel.setBounds(111, 28, 111, 14);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(111, 49, 175, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(341, 49, 156, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Fornecedor:");
		lblNewLabel_1.setBounds(341, 28, 89, 14);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Qtd Produto:");
		lblNewLabel_2.setBounds(552, 28, 89, 14);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("Categoria:");
		lblNewLabel_4.setBounds(176, 83, 111, 14);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblNewLabel_4);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(176, 105, 156, 22);
		contentPane.add(comboBox_2);
		
		JLabel lblNewLabel_5 = new JLabel("Valor Unitario");
		lblNewLabel_5.setBounds(347, 82, 91, 14);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblNewLabel_5);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(347, 105, 101, 22);
		contentPane.add(passwordField);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(10, 405, 631, -211);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setEnabled(false);
		table.setRowSelectionAllowed(false);
		table.setBounds(10, 138, 663, 266);
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
		
		JLabel lblNewLabel_6 = new JLabel("ID Produto:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6.setBounds(10, 28, 91, 14);
		contentPane.add(lblNewLabel_6);
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_2.setEditable(false);
		textField_2.setBounds(10, 49, 91, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton(new ImageIcon(getClass().getResource("/Imagens/Lupa.png")));
		btnNewButton.setBounds(296, 49, 27, 20);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Salvar",new ImageIcon(getClass().getResource("/Imagens/Salvar.png")));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(35, 436, 126, 40);
		contentPane.add(btnNewButton_1);
		
		JButton btnCancelar = new JButton("Sair",new ImageIcon(getClass().getResource("/Imagens/Logout.png")));
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				 new Menu().show();
			}
		});
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCancelar.setBounds(312, 436, 126, 40);
		contentPane.add(btnCancelar);
		
		JButton btnAlterar =  new JButton("Alterar",new ImageIcon(getClass().getResource("/Imagens/Alterar.png")));
		btnAlterar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAlterar.setBounds(176, 436, 126, 40);
		contentPane.add(btnAlterar);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(546, 49, 111, 22);
		contentPane.add(passwordField_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 105, 156, 22);
		contentPane.add(comboBox);
		
		JLabel lblMarca = new JLabel("Marca:");
		lblMarca.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMarca.setBounds(10, 83, 111, 14);
		contentPane.add(lblMarca);
		
		JButton button = new JButton(new ImageIcon(getClass().getResource("/Imagens/Alterar.png")));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastroFornecedor.show();
				dispose();
			}
		});
		button.setBounds(507, 51, 27, 20);
		contentPane.add(button);
		table.getColumnModel().getColumn(0).setPreferredWidth(29);
		table.getColumnModel().getColumn(1).setPreferredWidth(203);
		table.getColumnModel().getColumn(3).setPreferredWidth(134);
		table.getColumnModel().getColumn(4).setPreferredWidth(181);
	}
}
