package singleton;

public class TesteSingleton {
	public static void main(String[] args) {
		
		Singleton singleton = Singleton.getInstancia();
		Singleton singleton2 = Singleton.getInstancia();
		
		if(singleton == singleton2) {
			System.out.println("As duas variáveis referenciam a instancia de Singletons!");
		}else {
			System.out.println("As duas variáveis referenciam instancias diferentes do objeto Singleton!");
		}
		System.out.println("============================");
		System.out.println(Singleton.getInstancia());
		System.out.println(Singleton.getInstancia());
		System.out.println(Singleton.getInstancia());
	}

}
