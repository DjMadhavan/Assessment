class Employee 
{
	String empName;
	int empID;
	String empsalary;

	Employee()
	{
		
	}
	Employee(String empName)
	{
		this.empName=empName;
	}
	Employee(String empName , int empID)
	{
		this.empName=empName;
		this.empID=empID;
		
	}
	Employee(String empName, int empID, String empsalary)
	{
		this.empName = empName;
		this.empID = empID;
		this.empsalary = empsalary;
	}
	
	public String toString() 
	{
		return " Name : "+empName+""+" EmpID : "+empID+""+" Empsalary : "+empsalary;
	}
	class employeedriver 
{
	public static void main(String[] args) 
	
  {
	

			Employee ref=new Employee("Thala",70000,"50000");
		System.out.println(ref);
   }
 
}

}