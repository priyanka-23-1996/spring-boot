package jdbcExample.entity;

public class Student {
	
	private int id;
	private String name;
	private Long number;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getNumber() {
		return number;
	}
	public void setNumber(Long number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", number=" + number + "]";
	}
	public Student(int id, String name, Long number) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
	}
	

}
