package SpringDemo2;

import org.springframework.stereotype.Component;

@Component("userDAO")
public class UserDAOImpl implements UserDAO {

	@Override
	public void Save() {
		System.out.println("�����ݿ���Saveһ����¼");
		
	}

	
}
