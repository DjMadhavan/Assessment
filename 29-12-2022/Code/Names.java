abstract class College{
	int cid;
	String cname;
		College(int cid,String cname){
		this.cid=cid;
		this.cname = cname;
	}	
	void display(){
		System.out.println("College name :"+cname);
		System.out.println("College ID :"+cid);
		
	}
	abstract void department(int stud,String depatname);
}
class Me extends College{
	Me(int cid ,String cname){
		super(cid ,cname);
	}
	void department(int stud,String depatname){
		System.out.println("Department :"+ depatname);
		System.out.println("No of Student present:"+ stud);
	}
}
class Names{
	public static void main(String...args)
	{
	Me w=new Me(1024,"JCAS");
	w.display();
	w.department(47,"BCA");
	}
}	
