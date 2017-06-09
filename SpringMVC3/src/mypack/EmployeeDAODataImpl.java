package mypack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDAODataImpl implements EmployeeDAO{

	@Autowired
	HibernateTemplate hibernateTemplate;
	
	@Override
	public void addEmployee(Employee ref) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(ref);
	}
	
}
