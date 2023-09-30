package singleton;

public class TesteSingleton2 {

	public static void main(String[] args) {

		System.out.println(Singleton.getInstancia());
		System.out.println(Singleton.getInstancia());
		System.out.println("===========================");
		System.out.println(Singleton2.getInstancia());
		System.out.println(Singleton2.getInstancia());
		System.out.println(Singleton2.getInstancia());
	}
	
}
