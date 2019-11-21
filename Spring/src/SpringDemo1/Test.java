package SpringDemo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// 传统
		UserDAO userDao = new UserDAOImpl();
		userDao.Save();

		// 创建Spring的工厂
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDAO userDAO = (UserDAO) applicationContext.getBean("userDAO");
		userDAO.Save();

	}

}
