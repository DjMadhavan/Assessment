import java.util.*;
class Student implements Comparator<Student>{
	String sname;
	int sid,marks;
	double att;
		public int compare(Student s1, Student s2){
		return s1.sname.compareTo(s2.sname);
	}
	Student(String sname,int sid,int marks,double att)
	{
		this.sname=sname;
		this.sid=sid;
		this.marks=marks;
		this.att=att;
			}
	Student(){
	}
	public String toString()
	{
		return "Student Name :"+sname+"\t"+"Student ID:"+sid+"\t"+"Marks :"+marks+"\t"+"Attendance:"+att;
	}
}
class MainStudent
{
	public static void main(String...args)
	{
		LinkedList<Student> s=new LinkedList<Student>();
		Student s1= new Student("Zaheer",16045,86,99.5);
		Student s2=new Student("Arul",16012,90,77.5);
		Student s3=new Student("Shindhu",16037,60,60.6);
		s.add(s1);
		s.add(s2);
		s.add(s3);
		Collections.sort(s,new Student());
		Iterator it = s.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}
}