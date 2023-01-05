class College implements Runnable
{
	final String cname="JCAS";
	final int cid=1024;
	int noofstud=50;
	int sadmi=48;
	int seat;
	College(int seat)
	{
		this.seat=seat;
	}
	public void run()
	{
		synchronized (this){
		String name=Thread.currentThread().getName();
		if(sadmi<=noofstud)
		{
			System.out.println(name + " Got a Admission " + cname + " with "+cid);
			sadmi++;
			try{
				Thread.sleep(3500);
				 }catch(InterruptedException ie){}
			}
			else{
				System.out.println(cname+" with "+cid+" admission is full");
			}
		}
	}
}
class MainCollege
{
	public static void main(String...args)
	{
		College e =new College(3);
		Thread t1= new Thread(e);
		Thread t2= new Thread(e);
		Thread t3= new Thread(e);
		Thread t4= new Thread(e);
		t1.setName("Deva");
		t2.setName("Suriya");
		t3.setName("Natarajan");
		t4.setName("Babu");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}
}