package singleton;

public class TesteDataBaseConnection {
	
	public static void main(String[] args) {
		
		
		//obtendo uma instancia ÚNICA da classe DataBaseConnection
		DataBaseConnection conexao = DataBaseConnection.getConexao();
		conexao.conectar();
		conexao.desconectar();
		
		System.out.println("Conexão: " + conexao);
		
		DataBaseConnection conexao2 = DataBaseConnection.getConexao();
		System.out.println("Conexão: " + conexao2);
		
	}

}
