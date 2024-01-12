package composite_design_pattern;
// leaf object
public class Manager implements Employee{


    private String name; 
    private int empId; 
    private String position; 
    
	public Manager(String name, int empId, String position) {
		super();
		this.name = name;
		this.empId = empId;
		this.position = position;
	}

	@Override
	public void showEmpDetails() {
		System.out.println(name + " " + empId + " " + position);
		
	}

}
