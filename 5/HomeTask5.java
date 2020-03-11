

public class HomeTask5{
	public static void main(String[] args){
		Employee [] empArray = new Employee[5];
		empArray[0] = new Employee("Bob", "Judge", "bob@mail.com", "89264828573", 40000, 28);
		empArray[1] = new Employee("John", "Accountant", "john@mail.com", "89283468573", 30000, 31);
		empArray[2] = new Employee("Max", "IT-specialist", "max@mail.com", "89235828557", 55000, 42);
		empArray[3] = new Employee("Stuart", "Engineer", "stuart@mail.com", "89034828541", 28000, 24);
		empArray[4] = new Employee("Sheldon", "Director", "sheldon@mail.com", "89147828590", 62000, 50);
		
		for(int i = 0; i < empArray.length; i++){
			if(empArray[i].getAge() > 40){
				System.out.println(empArray[i].getId() + ") " + empArray[i].getInformation());
			}
		}
	}
} 