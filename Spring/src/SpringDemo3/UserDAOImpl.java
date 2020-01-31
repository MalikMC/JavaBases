package SpringDemo3;

import org.springframework.stereotype.Repository;

@Repository("userDAO")
public class UserDAOImpl implements UserDAO {

	@Override
	public void Save() {
		System.out.println("DAO层向数据库中Save一条记录");
		
	}

	
}
