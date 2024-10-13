package aop08;

public class CoreEx {
	public void zeroMethod(int a, int b) {
		
		try {
			System.out.printf("%d / %d = %d\n", a, b, a/b);
		} catch(Exception e) {
			//System.out.println("0으로 나눌 수 없습니다.");
			throw new RuntimeException("0으로 나눌 수 없습니다.");
		}
	}
}
