package SpringDemo3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServicelmpl implements UserService {
    
	//ע��DAO
	@Autowired
	private UserDAO userDAO;
	@Override
	public void Save() {
	 System.out.println("UserSercie Save��������DAO��ķ���");
		userDAO.Save();
	}

}
