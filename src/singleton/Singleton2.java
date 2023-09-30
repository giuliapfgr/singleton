package singleton;

public class Singleton2 {
	
	private static Singleton2 instancia = new Singleton2();

	// não quero deixar o usuario criar o objeto -- cria o construtor

	private Singleton2() {


	}

	public static Singleton2 getInstancia(){
		return instancia;
	}
	
}
