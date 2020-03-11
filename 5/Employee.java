
public class Employee{
	private String name, position, email, number;
	private int salary, age, id;
	private static int counter = 0;
	
	
	public Employee(String name, String position, String email, String number, int salary, int age){
		this.name = name;
		this.position = position;
		this.email = email;
		this.number = number;
		this.salary = salary;
		this.age = age;
		counter++;
		this.id = counter;
	}
	
	public int getId(){
		return id;
	}
	
	public int getAge(){
		return age;
	}
	
	public String getInformation(){
		return  "Name - " + name + "; Position - " + position + "; Email - " + email + "; Number - " + number + "; Salary - " + salary + "; Age - " + age;
	}
}