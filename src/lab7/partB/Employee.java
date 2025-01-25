package lab7.partB;

public class Employee {
	private String name;
	private int salary;
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override 
	public String toString() {
		return "(" + name + ", " + salary + ")";
	}
	
	//public boolean equals(Employee e) {
	//	return e.name.equals(name) && e.salary == salary;
	//}
	// This  equals method (equals(Employee e)) is not the method used by Java's collections framework.

public boolean equals(Object ob) {
		Employee e = (Employee)ob;
	return e.name.equals(name) && e.salary == salary;
	}
}
