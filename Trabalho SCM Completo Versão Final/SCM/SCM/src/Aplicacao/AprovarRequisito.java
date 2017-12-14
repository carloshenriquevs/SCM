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

public class AprovarRequisito extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AprovarRequisito frame = new AprovarRequisito();
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
	public AprovarRequisito() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setModalExclusionType(ModalExclusionType.TOOLKIT_EXCLUDE);
		setResizable(false);
		setTitle("Aprova\u00E7\u00E3o de Requisi\u00E7\u00F5es");
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
		table.setBounds(10, 100, 731, 325);
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
		
		final JButton btn_UserConsulta = new JButton(new ImageIcon(getClass().getResource("/Imagens/Lupa.png")));
		btn_UserConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_UserConsulta.setBounds(323, 43, 34, 27);
		contentPane.add(btn_UserConsulta);
		
		JButton btnAprovar = new JButton("Aprovar",new ImageIcon(getClass().getResource("/Imagens/Salvar.png")));
		btnAprovar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAprovar.setBounds(35, 436, 126, 40);
		contentPane.add(btnAprovar);
		
		JButton btnNegar = new JButton("Negar",new ImageIcon(getClass().getResource("/Imagens/Cancelar.png")));
		btnNegar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNegar.setBounds(174, 436, 126, 40);
		contentPane.add(btnNegar);
		
		JButton btnAjustar = new JButton("Ajustar",new ImageIcon(getClass().getResource("/Imagens/Alterar.png")));
		btnAjustar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAjustar.setBounds(310, 436, 126, 40);
		contentPane.add(btnAjustar);
		
		JLabel lblData = new JLabel("Data da Requisi\u00E7\u00F5es :");
		lblData.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblData.setBounds(22, 43, 160, 20);
		contentPane.add(lblData);
		
		textField = new JTextField();
		textField.setBounds(174, 43, 139, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Listar todos do Dia:");
		chckbxNewCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 14));
		chckbxNewCheckBox.setBounds(405, 43, 189, 27);
		contentPane.add(chckbxNewCheckBox);
		
		JButton button = new JButton("Sair",new ImageIcon(getClass().getResource("/Imagens/Logout.png")));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();

				 new Menu().show();
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 14));
		button.setBounds(446, 436, 126, 40);
		contentPane.add(button);
		table.getColumnModel().getColumn(0).setPreferredWidth(29);
		table.getColumnModel().getColumn(1).setPreferredWidth(203);
		table.getColumnModel().getColumn(3).setPreferredWidth(134);
		table.getColumnModel().getColumn(4).setPreferredWidth(181);
		
		
	}

}
