import java.util.*;
import java.io.*;
class Book implements Serializable
{
	String aname,bname;
	int bnum;
	Book(String aname,String bname,int bnum)
	{
		this.aname=aname;
		this.bname=bname;
		this.bnum=bnum;
	}
	public String toString()
	{
		return "Author Name :"+aname+"\t"+"Book Name:"+bname+"\t"+"Book Number:"+bnum;
	}
}
class MainBook
{
	public static void main(String...args)throws IOException,ClassNotFoundException
	{
		HashSet<Book> b=new HashSet<Book>();
		Book b1=new Book("Sharad Kumar Verma","Data Structure Using C", 978-93-5163-389-1);
		Book b2=new Book("A. E. Coppard","The Higgler",1-86092-010-1);
		b.add(b1);
	    b.add(b2);
		for(Book b3:b)
		{
			System.out.println(b3);
		}
	    Iterator it =b.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		FileOutputStream fos=new FileOutputStream("C:\\Maddy Project\\5-1-2023\\Code\\b3");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(b);
		oos.close();
		fos.close();
		FileInputStream fis=new FileInputStream("C:\\Maddy Project\\5-1-2023\\Code\\b3");
		ObjectInputStream ois=new ObjectInputStream(fis);
		HashSet<Book> s=(HashSet<Book>)ois.readObject();
		ois.close();
		fis.close();
		for(Book b3:s)
		{
			System.out.println(b3);
		}
         HashSet<Book> s1 =(HashSet<Book>)s.clone();
		 Iterator t=s1.iterator();
		 while(t.hasNext())
		 {
			 System.out.println(t.next());
			 System.out.println("Close");
		 }
	}
	
}