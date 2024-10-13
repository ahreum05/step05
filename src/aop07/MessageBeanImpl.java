package aop07;

public class MessageBeanImpl implements MessageBean{
	private String name;
	@Override
	public void sayHello() {
		try {
			Thread.sleep(3000);		// 3000ms = 3초동안 프로그램 지연
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Hello, " + name + "!!");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
