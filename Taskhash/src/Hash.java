import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;






public class Hash {

	public static void main(String[] args) {
		 Hashtable<Integer,Employee> ht=new Hashtable<Integer,Employee>();  
		
			System.out.println("Creating the Employee List ");
			Scanner sc =new Scanner (System.in);
			System.out.println("Please enter the no of employee to create");
			int len= sc.nextInt();
		for(int i=0; i<len; i++)
		{
			System.out.println("Please enter the ID");
			int employeeID= sc.nextInt();
			sc.nextLine();
			System.out.println("Please enter the name");
		String employeeName= sc.nextLine();
		
		System.out.println("Please enter the Designation");
		String Designation= sc.nextLine();
		System.out.println("Please enter the Salary");
		Double Salary= sc.nextDouble();
		
		Employee e= new Employee (employeeID, employeeName, Designation, Salary);
		ht.put(i, e);
		
		}
		 for(Map.Entry<Integer, Employee> entry:ht.entrySet()){
			 
			 Employee Emp=entry.getValue();
			 
			 System.out.println(Emp.getEmployeeID()+" "+Emp.getEmployeeName()+" "+Emp.
			  getDesignation()+" "+Emp.getSalary()); }
		 System.out.println(" modifying the employee List");
		 System.out.println("Please enter the position  you want to modify:");
		int k= sc.nextInt();
sc.nextLine();
if(k<=len) {
			System.out.println("Please enter the ID you want to change");
			int employeeID= sc.nextInt();
			sc.nextLine();
			System.out.println("Please enter the name you want to change ");
		String employeeName= sc.nextLine();
		
		System.out.println("Please enter the Designation you want to change ");
		String Designation= sc.nextLine();
		System.out.println("Please enter the Salary you want to change ");
		Double Salary= sc.nextDouble();
		 
		 ht.replace(k, new Employee(employeeID, employeeName, Designation, Salary) );
for(Map.Entry<Integer, Employee> entry:ht.entrySet()){
			 
			 Employee Emp=entry.getValue();
			 
			 System.out.println(Emp.getEmployeeID()+" "+Emp.getEmployeeName()+" "+Emp.
			  getDesignation()+" "+Emp.getSalary());
			 }}else {
				 System.out.println("pleasze enter the available position");
			 }
System.out.println("Delete the Employee List");
System.out.println("Please enter the position  you want to delete:");
int j= sc.nextInt();
if(j<=len) {
ht.remove(j, ht.get(j));
for(Map.Entry<Integer, Employee> entry:ht.entrySet()){
	 
	 Employee Emp=entry.getValue();
	 
	 System.out.println(Emp.getEmployeeID()+" "+Emp.getEmployeeName()+" "+Emp.
	  getDesignation()+" "+Emp.getSalary());
	 }}else {
		 System.out.println("pleasze enter the available position");
		 }
System.out.println("search  the Employee List");
System.out.println("Please enter the position  you want to search:");
int s= sc.nextInt();
if(s<=len) {
if(ht.containsKey(s)) {
	  
	  System.out.println(ht.get(s));
	  
	 System.out.println("The detail is avaliable"); 
	  }
	  else {
	  System.out.println("The detail is not avaliable");
	  }
	}}
	
	
	
	

}
