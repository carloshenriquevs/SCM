package Aplicacao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Dimension;
import java.awt.Window.Type;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import javax.swing.JSlider;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.event.MenuKeyListener;
import javax.swing.event.MenuKeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Menu extends JFrame {

	private JPanel contentPane;

	CadastroUsuario cadastroUsuario = new CadastroUsuario();
	CadastroProduto cadastroProdudo = new CadastroProduto();
	RequisitaMateriais requisitaMateriais = new RequisitaMateriais();
	AprovarRequisito aprovarRequisito = new AprovarRequisito();
	LiberarRequisito liberarRequisito = new LiberarRequisito();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setResizable(false);
		setTitle("SCM - Controle de Estoque");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Administrador\\Dropbox\\Trabalho\\SCM\\SCM\\Imagem\\favicon.ico"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 712, 580);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "SCM - Menu", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(0, 0, 686, 65);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(6, 17, 670, 35);
		panel.add(menuBar);
		//menuBar.setMaximumSize(new Dimension(255, 35));
		menuBar.setPreferredSize(new Dimension(255, 35));
		
		JMenu Cadastro = new JMenu("Cadastro");
		Cadastro.setFont(new Font("Segoe UI", Font.BOLD, 16));
		Cadastro.setHorizontalAlignment(SwingConstants.CENTER);
		
		menuBar.add(Cadastro);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Usuario");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cadastroUsuario.show();
				setVisible(false);
				
			}  
      });
		
		Cadastro.add(mntmNewMenuItem);
		
		JSeparator separator = new JSeparator();
		Cadastro.add(separator);
		
		JMenuItem mntmCadastrar = new JMenuItem("Materiais");
		mntmCadastrar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cadastroProdudo.show();
				setVisible(false);
				
			}  
      });
		
		Cadastro.add(mntmCadastrar);
		
		JMenu Requisicao = new JMenu("Requisi\u00E7\u00E3o");
		Requisicao.setFont(new Font("Segoe UI", Font.BOLD, 16));
		Requisicao.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(Requisicao);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Requisitar Materiais");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				requisitaMateriais.show();
				setVisible(false);
				
			}  
      });
		Requisicao.add(mntmNewMenuItem_1);
		
		JSeparator separator_1 = new JSeparator();
		Requisicao.add(separator_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Aprovar Requisi\u00E7\u00F5es");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				aprovarRequisito.show();
				setVisible(false);
				
			}  
      });
		Requisicao.add(mntmNewMenuItem_2);
		
		JSeparator separator_2 = new JSeparator();
		Requisicao.add(separator_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Liberar Requisi\u00E7\u00F5es");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				liberarRequisito.show();
				setVisible(false);
				
			}  
      });
		Requisicao.add(mntmNewMenuItem_3);
		
		JMenu Relatorio = new JMenu("Relatorio");
		Relatorio.setFont(new Font("Segoe UI", Font.BOLD, 16));
		Relatorio.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(Relatorio);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Requisi\u00E7\u00F5es");
		Relatorio.add(mntmNewMenuItem_4);
		
		JSeparator separator_3 = new JSeparator();
		Relatorio.add(separator_3);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Estoque");
		Relatorio.add(mntmNewMenuItem_5);
		
		JSeparator separator_4 = new JSeparator();
		Relatorio.add(separator_4);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Entrada / Saida");
		Relatorio.add(mntmNewMenuItem_6);
		
		JMenu Ajuda = new JMenu("Ajuda");
		Ajuda.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(Ajuda);
		
		JMenuItem SCM = new JMenuItem("SCM - Suporte");
		Ajuda.add(SCM);
	}
}
