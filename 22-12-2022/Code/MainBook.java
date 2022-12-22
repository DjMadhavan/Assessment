class Book{  
       String Pname;
	   String Bname;
	   String Aname;
      int isbcnum;  
       void setPname(String Pname)
	   {
		   this.Pname=Pname;
	   }
	   void setBname(String Bname)
	   {
		   this.Bname=Bname;
	   }
	   void setAname(String Aname)
	   {
		   this.Aname=Aname;
	   }
	   void setisbcnum(int isbcnum)
	   {
		   this.isbcnum=isbcnum;
	   }
	   String getPname()
	   {
		   return Pname;
	   }
	   String getBname()
	   {
		   return Bname;
	   }
	   String getAname()
	   {
		   return Aname;
	   }
	   int getisbcnum()
	   {
		   return isbcnum;
	   }
 }  
  class McGrawhill extends Book{  
           
       
  }  
  class Packt extends Book{
  
  }
 public class MainBook extends Packt {  
       public static void main(String[] args) {  
            Packt p = new Packt();  
               p.setPname("Voldemort");
			   p.setBname("Harry Potter");
			   p.setAname("J.K.Rowling");
			   p.setisbcnum(221222);
			   System.out.println("Pname :" + p.getPname());
			   System.out.println("Bname :" + p.getBname());
			   System.out.println("Aname :" + p.getAname());
			   System.out.println("isbcnum :" + p.getisbcnum());
			   
       }  
  }  