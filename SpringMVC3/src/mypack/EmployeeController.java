package mypack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/add")
public class EmployeeController {
	
	@Autowired
	EmployeeDAO empDAO;
	
	@RequestMapping(method= RequestMethod.GET)
	public ModelAndView before(){
		Employee e = new Employee();
		return new ModelAndView("Emp", "empObj", e);
		
	}
	
	@RequestMapping(method= RequestMethod.POST)
	public String afterSubmit(Employee ref){
		empDAO.addEmployee(ref);
		return "success";
	}
}
