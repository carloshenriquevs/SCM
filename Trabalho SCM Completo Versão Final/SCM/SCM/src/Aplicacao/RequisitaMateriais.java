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

public class RequisitaMateriais extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;
	private JTextField txt_idrequisito;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RequisitaMateriais frame = new RequisitaMateriais();
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
	public RequisitaMateriais() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setModalExclusionType(ModalExclusionType.TOOLKIT_EXCLUDE);
		setResizable(false);
		setTitle("Requisita Materiais");
		setBounds(100, 100, 761, 536);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.controlShadow);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario :");
		lblNewLabel.setBounds(111, 28, 64, 14);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(111, 49, 180, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 107, 123, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lb_codigoproduto = new JLabel("Codigo Produto:");
		lb_codigoproduto.setBounds(10, 86, 120, 14);
		lb_codigoproduto.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lb_codigoproduto);
		
		JLabel lb_qtdProduto = new JLabel("Qtd Material:");
		lb_qtdProduto.setBounds(389, 86, 89, 14);
		lb_qtdProduto.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lb_qtdProduto);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(389, 107, 89, 22);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("Setor:");
		lblNewLabel_3.setBounds(356, 28, 89, 14);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblNewLabel_3);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(354, 49, 172, 22);
		contentPane.add(comboBox_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(10, 405, 631, -211);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setEnabled(false);
		table.setRowSelectionAllowed(false);
		table.setBounds(10, 138, 731, 287);
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
		
		JLabel lb_idrequisito = new JLabel("ID Requisito:");
		lb_idrequisito.setFont(new Font("Tahoma", Font.BOLD, 12));
		lb_idrequisito.setBounds(10, 28, 91, 14);
		contentPane.add(lb_idrequisito);
		
		txt_idrequisito = new JTextField();
		txt_idrequisito.setEnabled(false);
		txt_idrequisito.setEditable(false);
		txt_idrequisito.setBounds(10, 49, 91, 22);
		contentPane.add(txt_idrequisito);
		txt_idrequisito.setColumns(10);
		
		JButton btn_UserConsulta = new JButton(new ImageIcon(getClass().getResource("/Imagens/Lupa.png")));
		btn_UserConsulta.setBounds(301, 49, 27, 20);
		contentPane.add(btn_UserConsulta);
		
		JButton btnNewButton_1 = new JButton("Salvar",new ImageIcon(getClass().getResource("/Imagens/Salvar.png")));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(35, 436, 126, 40);
		contentPane.add(btnNewButton_1);
		
		JButton btnCancelar = new JButton("Cancelar",new ImageIcon(getClass().getResource("/Imagens/Cancelar.png")));
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				 new Menu().show();
			}
		});
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCancelar.setBounds(174, 436, 126, 40);
		contentPane.add(btnCancelar);
		
		JButton btnAlterar = new JButton("Alterar",new ImageIcon(getClass().getResource("/Imagens/Alterar.png")));
		btnAlterar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAlterar.setBounds(310, 436, 126, 40);
		contentPane.add(btnAlterar);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(180, 107, 196, 22);
		contentPane.add(textField_2);
		
		JLabel label = new JLabel("Produto:");
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setBounds(180, 86, 71, 14);
		contentPane.add(label);
		
		JButton btn_prodConsultar = new JButton(new ImageIcon(getClass().getResource("/Imagens/Lupa.png")));
		
		btn_prodConsultar.setBounds(143, 107, 27, 20);
		contentPane.add(btn_prodConsultar);
		table.getColumnModel().getColumn(0).setPreferredWidth(29);
		table.getColumnModel().getColumn(1).setPreferredWidth(203);
		table.getColumnModel().getColumn(3).setPreferredWidth(134);
		table.getColumnModel().getColumn(4).setPreferredWidth(181);
	}
}
