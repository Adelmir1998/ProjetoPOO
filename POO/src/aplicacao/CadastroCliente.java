package aplicacao;

import classes.PrjCliente;
import classes.PrjEndereco;
import classes.PrjUsuario;
import repositorio.Reposistema;

public class CadastroCliente {

	public static void main(String[] args) {
		
		PrjUsuario usuario = new PrjUsuario();
		PrjEndereco endereco = new PrjEndereco();
		PrjCliente cliente = new PrjCliente();
		
		usuario.idUsuario = 10;
		usuario.nomeUsuario = "marcela";
		usuario.senha = "123";
		
		endereco.idEndereco = 53;
		endereco.logradouro = "Rua Jose";
		endereco.numero = "10";
		endereco.bairro = "Tatuap?";
		
		cliente.idCliente = 54;
		cliente.nomeCliente = "Paulo";
		cliente.email="paulo@terra.com.br";
		cliente.usuario = usuario;
		cliente.endereco = endereco;
		
		Reposistema rs = new Reposistema();
		System.out.println(rs.cadUsuario(usuario));
		System.out.println(rs.cadEndereco(endereco));
		System.out.println(rs.cadCliente(cliente));
		
		
	}

}
