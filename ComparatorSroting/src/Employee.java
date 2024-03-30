
public class Employee {
	private Integer id;
	private String name;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]"+"\n";
	}
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	

}
