package spring;

import org.springframework.stereotype.Component;

@Component
public class EmpDaoImpl implements EmpDao {

	

	@Override
	public void save(String message) {
		// TODO Auto-generated method stub
		System.out.println("Emp saved"+message);
	}
	

}
