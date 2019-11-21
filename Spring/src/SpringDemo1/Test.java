package SpringDemo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// ��ͳ
		UserDAO userDao = new UserDAOImpl();
		userDao.Save();

		// ����Spring�Ĺ���
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDAO userDAO = (UserDAO) applicationContext.getBean("userDAO");
		userDAO.Save();

	}

}
