
public class Employee {
	
		 private int EmployeeID;
		 private String EmployeeName;
		
		private  String Designation;
	  private double Salary;
		public Employee( int employeeID, String employeeName, String designation, double salary) {
			
			EmployeeName = employeeName;
			EmployeeID = employeeID;
			Designation = designation;
			Salary = salary;
		}
		
		
		public String getEmployeeName() {
			return EmployeeName;
		}
		
		public int getEmployeeID() {
			return EmployeeID;
		}
		
		public String getDesignation() {
			return Designation;
		}
		public double getSalary() {
			return Salary;
		}


		@Override
		public String toString() {
			return " [EmployeeID=" + EmployeeID + ", EmployeeName=" + EmployeeName + ", Designation=" + Designation
					+ ", Salary=" + Salary + "]";
		}
		
		 
	}



