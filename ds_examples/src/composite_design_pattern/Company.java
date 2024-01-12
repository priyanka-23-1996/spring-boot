package composite_design_pattern;
//class that will also be treated as a Client and ii will use the Employee interface
public class Company {

	public static void main(String[] args) {
		
		Developer d1= new Developer("ram", 1, "java");
		Developer d2=new Developer("shyam", 2, "frontend");
		
		CompanyDirectory obj = new CompanyDirectory();
		obj.addEmployee(d1);
		obj.addEmployee(d2);
		
		Manager m1= new Manager("priya", 4, "pso");
		Manager m2=new Manager("vidya",5,"cso");
		
		CompanyDirectory obj2= new CompanyDirectory();
		obj2.addEmployee(m1);
		obj2.addEmployee(m2);
		
		CompanyDirectory directory=new CompanyDirectory();
		directory.addEmployee(obj);
		directory.addEmployee(obj2);
		directory.showEmpDetails();
		

	}

}
