package aplicacao;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import classes.PrjCliente;
import classes.PrjEndereco;
import classes.PrjUsuario;
import repositorio.Reposistema;

public class FormCliente extends JFrame {

	private JPanel contentPane;
	private JTextField txtIdCliente;
	private JTextField txtNomeCliente;
	private JTextField txtEmail;
	private JTextField txtIdUsuario;
	private JTextField txtnomeUsuario;
	private JPasswordField txtSenha;
	private JTextField txtIdEndereco;
	private JTextField txtLogradouro;
	private JTextField txtNumero;
	private JTextField txtBairro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormCliente frame = new FormCliente();
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
	public FormCliente() {
		setResizable(false);
		setTitle("Gerenciar Clientes");
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 563, 554);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(95, 158, 160));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIdCliente = new JLabel("Id do Cliente:");
		lblIdCliente.setFont(new Font("Arial", Font.BOLD, 16));
		lblIdCliente.setForeground(Color.WHITE);
		lblIdCliente.setBounds(10, 11, 153, 23);
		contentPane.add(lblIdCliente);
		
		txtIdCliente = new JTextField();
		txtIdCliente.setBounds(10, 35, 101, 30);
		contentPane.add(txtIdCliente);
		txtIdCliente.setColumns(10);
		
		JLabel lblNomeCliente = new JLabel("Nome do Cliente:");
		lblNomeCliente.setFont(new Font("Arial", Font.BOLD, 16));
		lblNomeCliente.setForeground(Color.WHITE);
		lblNomeCliente.setBounds(138, 15, 153, 14);
		contentPane.add(lblNomeCliente);
		
		txtNomeCliente = new JTextField();
		txtNomeCliente.setBounds(138, 35, 398, 30);
		contentPane.add(txtNomeCliente);
		txtNomeCliente.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-Mail");
		lblEmail.setFont(new Font("Arial", Font.BOLD, 16));
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setBounds(10, 76, 59, 14);
		contentPane.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(10, 101, 526, 30);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblidUsuario = new JLabel("Id do Usu\u00E1rio:");
		lblidUsuario.setForeground(Color.WHITE);
		lblidUsuario.setFont(new Font("Arial", Font.BOLD, 16));
		lblidUsuario.setBounds(10, 208, 153, 14);
		contentPane.add(lblidUsuario);
		
		txtIdUsuario = new JTextField();
		txtIdUsuario.setColumns(10);
		txtIdUsuario.setBounds(10, 233, 124, 30);
		contentPane.add(txtIdUsuario);
		
		JLabel lblnomeUsuario = new JLabel("Nome do Usu\u00E1rio");
		lblnomeUsuario.setForeground(Color.WHITE);
		lblnomeUsuario.setFont(new Font("Arial", Font.BOLD, 16));
		lblnomeUsuario.setBounds(149, 208, 153, 14);
		contentPane.add(lblnomeUsuario);
		
		txtnomeUsuario = new JTextField();
		txtnomeUsuario.setColumns(10);
		txtnomeUsuario.setBounds(144, 233, 248, 30);
		contentPane.add(txtnomeUsuario);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(402, 233, 134, 30);
		contentPane.add(txtSenha);
		
		JLabel lblsenha = new JLabel("Senha:");
		lblsenha.setForeground(Color.WHITE);
		lblsenha.setFont(new Font("Arial", Font.BOLD, 16));
		lblsenha.setBounds(402, 208, 153, 14);
		contentPane.add(lblsenha);
		
		JLabel lblidEndereco = new JLabel("Id do Endere\u00E7o:");
		lblidEndereco.setForeground(Color.WHITE);
		lblidEndereco.setFont(new Font("Arial", Font.BOLD, 16));
		lblidEndereco.setBounds(10, 292, 153, 14);
		contentPane.add(lblidEndereco);
		
		txtIdEndereco = new JTextField();
		txtIdEndereco.setColumns(10);
		txtIdEndereco.setBounds(10, 317, 124, 30);
		contentPane.add(txtIdEndereco);
		
		JLabel lblLogradouro = new JLabel("Logradouro:");
		lblLogradouro.setForeground(Color.WHITE);
		lblLogradouro.setFont(new Font("Arial", Font.BOLD, 16));
		lblLogradouro.setBounds(149, 292, 153, 14);
		contentPane.add(lblLogradouro);
		
		txtLogradouro = new JTextField();
		txtLogradouro.setColumns(10);
		txtLogradouro.setBounds(148, 317, 388, 30);
		contentPane.add(txtLogradouro);
		
		JLabel lblidNumero = new JLabel("N\u00FAmero:");
		lblidNumero.setForeground(Color.WHITE);
		lblidNumero.setFont(new Font("Arial", Font.BOLD, 16));
		lblidNumero.setBounds(10, 371, 153, 14);
		contentPane.add(lblidNumero);
		
		txtNumero = new JTextField();
		txtNumero.setColumns(10);
		txtNumero.setBounds(10, 396, 124, 30);
		contentPane.add(txtNumero);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setForeground(Color.WHITE);
		lblBairro.setFont(new Font("Arial", Font.BOLD, 16));
		lblBairro.setBounds(149, 371, 153, 14);
		contentPane.add(lblBairro);
		
		txtBairro = new JTextField();
		txtBairro.setColumns(10);
		txtBairro.setBounds(148, 396, 388, 30);
		contentPane.add(txtBairro);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Instancia da classe PRJUsuario
				PrjUsuario usuario = new PrjUsuario();
				//Instancia da classe PRJEndereco
				PrjEndereco endereco = new PrjEndereco();
				//Instancia da classe PRJCliente
				PrjCliente cliente = new PrjCliente();
				//Vamos adicionar o cliente a mem?ria com o RepoSistema
				Reposistema rs = new Reposistema();
				
				usuario.idUsuario = Integer.parseInt(txtIdUsuario.getText());
				usuario.nomeUsuario = txtnomeUsuario.getText();
				usuario.senha = txtSenha.getText();
				
				endereco.idEndereco = Integer.parseInt(txtIdEndereco.getText());
				endereco.logradouro = txtLogradouro.getText();
				endereco.numero = txtNumero.getText();
				endereco.bairro = txtBairro.getText();
				
				cliente.idCliente = Integer.parseInt(txtIdCliente.getText());
				cliente.nomeCliente = txtNomeCliente.getText();
				cliente.email = txtEmail.getText();
				cliente.usuario = usuario;
				cliente.endereco = endereco;
				
				
				JOptionPane.showMessageDialog(null,rs.cadUsuario(usuario)+"\n"+rs.cadEndereco(endereco)+"\n"+rs.cadCliente(cliente));
			}
		});
		btnCadastrar.setBounds(218, 437, 113, 37);
		contentPane.add(btnCadastrar);
	}
}
