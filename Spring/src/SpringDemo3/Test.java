package SpringDemo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {


		// 创建Spring的工厂
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext3.xml");
		UserService userService = (UserService) applicationContext.getBean("userService");
		userService.Save();

	}

}
