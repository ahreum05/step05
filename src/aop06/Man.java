package aop06;

import org.springframework.stereotype.Component;

@Component
public class Man implements Person{

	@Override
	public void classwork() {
		System.out.println("컴퓨터를 켜고 Game을 시작한다.");
	}

}
