class Employee{
	String name;
	int age;
	int phonenumber;
	String address;
	double salary;
	void printSalary() {
		System.out.println("Salary: "+salary);
	}
}
class Officier extends Employee{
	String specialisation;
	Officier(String name,int age,int phonenumber,String address,double salary,String specialisation){
		this.name=name;
		this.age=age;
		this.phonenumber=phonenumber;
		this.address=address;
		this.salary=salary;
		this.specialisation=specialisation;
	}
	void OfficierDetails() {
		System.out.println("Officier");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Phone Number :"+phonenumber);
		System.out.println("Address: "+address);
		printSalary();
		System.out.println("Specialisation: "+specialisation);
		System.out.println();
	}
}
class Manager extends Employee{
	String department;
	Manager(String name,int age,int phonenumber,String address,double salary,String department){
		this.name=name;
		this.age=age;
		this.phonenumber=phonenumber;
		this.address=address;
		this.salary=salary;
		this.department=department;
	}
	void ManagerDetails() {
		System.out.println("Manager");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Phone Number :"+phonenumber);
		System.out.println("Address: "+address);
		printSalary();
		System.out.println("Department: "+department);
	}
}
public class Main {
	public static void main(String args[]) {
		Officier officier=new Officier("Leo",35,987654321,"New Villa Garden",500,"XYZ");
		officier.OfficierDetails();
		Manager manager=new Manager("Cris",47,787614327,"Eden Garden",10000,"ABC");
		manager.ManagerDetails();
	}
}