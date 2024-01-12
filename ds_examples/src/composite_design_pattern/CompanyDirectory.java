package composite_design_pattern;

import java.util.ArrayList;
import java.util.List;

// Class used to get Employee List and do the operations like add or remove Employee 

public class CompanyDirectory implements Employee{
	
	private List<Employee> employeeList = new ArrayList<Employee>(); 

	@Override
	public void showEmpDetails() {
		for(Employee e: employeeList) {
			e.showEmpDetails();
		}
		
	}
	public void addEmployee(Employee emp) 
    { 
        employeeList.add(emp); 
    } 

	 public void removeEmployee(Employee emp) 
	  { 
	        employeeList.remove(emp); 
	  } 
}
