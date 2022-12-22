class Employee{
        String name;
		int id;
		int salary;
		double inc_salary;
		Employee(String name,int id,int salary)
		{
		   this.name=name;
		   this.id=id;
		   this.salary=salary;
		}
		public String toString()
		{
		   return "Employee name : "+name+"\n"+"Employee id : "+id+"\n"+"Employee salary : "+salary;
		}
		void increment(int increment_per)
		{
			float f=((float)increment_per/500)*salary;
			System.out.println("incremented salary of the employee"+" "+name+" is "+(f+salary));
		}
}
class MainEmployee{
        public static void main(String args[])
		{
		   Employee m=new Employee("Maran",1834,16523);
		   System.out.println(m);
		   m.increment(5);

		}
}