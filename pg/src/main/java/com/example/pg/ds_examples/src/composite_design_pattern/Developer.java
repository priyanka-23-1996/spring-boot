package composite_design_pattern;
// developer is a leaf object
public class Developer implements Employee{

	private String name;
	private int empId;
	private String position;
	
	public Developer(String name, int empId, String position) {
		super();
		this.name = name;
		this.empId = empId;
		this.position = position;
	}

	@Override
	public void showEmpDetails() {
		
		System.out.println(name +" "+ empId +" "+ position);
	}

}
