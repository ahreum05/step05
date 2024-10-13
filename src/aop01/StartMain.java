package aop01;

public class StartMain {
	public static void main(String[] args) {
		Man man = new Man();
		man.classwork();
		System.out.println("----------------");
		
		Woman woman = new Woman();
		woman.classwork();
	}
}
