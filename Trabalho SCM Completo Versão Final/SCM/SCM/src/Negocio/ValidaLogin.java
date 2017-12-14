package Negocio;

import javax.swing.JTextField;

public class ValidaLogin {

	private String usuario = "Admin" , senha = "Admin";
	 
	
	
	public boolean validar(JTextField Usuario, JTextField Senha) {
	
		
		if(Usuario.getText().equals(usuario) && Senha.getText().equals(senha)) {
			return true;
		}
		
		return false;
		
	}
}
