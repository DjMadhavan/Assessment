class Manager extends Thread{
	StringBuffer s;
	Manager(){
		s = new StringBuffer();
	}
	public void run(){
		synchronized(s){
		for(int i=0;i<=30;i++){
			s.append(i+" , ");
		}
		s.notify();
		System.out.println("Manager notifying Employee to start working");
		}
	}
}
class Employee extends Thread{
	Manager m;
	Employee(Manager m){
		this.m = m;
	}
	public void run(){
		synchronized(m.s){
			try{
			System.out.println("Employee is waiting for Manager to notify the Message");
			m.s.wait();
			}catch(InterruptedException ie){
			}
			System.out.println(m.s);
		}
	}
}
class ThreadEx {
	public static void main(String... args){
		Manager m = new Manager();
		Employee e = new Employee(m);
		Thread t1 = new Thread(m);
		Thread t2 = new Thread(e);
		t2.start();
		t1.start();
	}
}