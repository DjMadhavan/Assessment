class A{
	
	public void display(){
		System.out.println("A displaying ..");
	}
}
class B{
	
	public void show(){
		System.out.println("B Showing..");
	}
}
class C extends Thread{
	A a;
	B b;
	C (A a, B b)
	{
		this.a=a;
		this.b=b;
	}
	public void run(){
		synchronized(a){
			a.display();
			try{
		Thread.sleep(1000);
		}
	catch(InterruptedException e){
		}
		synchronized(b){
			b.show();
		}
		}
	}
}
class D extends Thread{
	A a;
	B b;
	D (A a, B b)
	{
		this.a=a;
		this.b=b;
	}
	public void run(){
		synchronized(b){
			b.show();
			try{
		Thread.sleep(2000);
		}
	catch(InterruptedException e){
		}
		synchronized(a){
			a.display();
		}
		}
	}
}
class Deadlock{
	public static void main(String... args)
	{
		A a=new A();
		B b=new B();
	    C c=new C(a,b);
	    D d=new D(a,b);
	   Thread t1=new Thread(c);
	   Thread t2=new Thread(d);
	   t1.start();
	   t2.start();
	  	}
}