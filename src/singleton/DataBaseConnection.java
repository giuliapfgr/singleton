package singleton;

public class DataBaseConnection {
	
	//atributo privado
	private static DataBaseConnection conexao;
	
	private DataBaseConnection() {
		//construtor privado para evitar instancias diretas
	}
	
	public static DataBaseConnection getConexao() {
		if(conexao == null) {
			conexao = new DataBaseConnection();
			
		}
		return conexao;
	}
	
	public void conectar() {
		//conexao com o banco de dados
		System.out.println("Conectando com o banco de dados!");
	}
	
	public void desconectar() {
		//desconexao com o banco de dados
		System.out.println("Desconectando com o banco de dados!");
	}

}
