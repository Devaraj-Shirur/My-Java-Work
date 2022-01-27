package BasicMethods;

public class Employee {
	private String name="Devaraj";
	private int ID=22;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", ID=" + ID + "]";
	}
	


}
