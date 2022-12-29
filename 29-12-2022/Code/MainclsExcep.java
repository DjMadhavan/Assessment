class MyclsExcep extends Exception{
       MyclsExcep(String str){
	      super(str);
		 }
		 static String name[]={"Aravind","Abi","Punitha","Divya","Zaheer"};
		 static int id[]={1601,1602,1604,1603,1605};
		 static double att[]={66.7,59.8,77.5,80.6,50};
		 static int marks[]={77,87,65,80,56};
}
class MainclsExcep{
		 public static void main(String...args){
		   for(int i=0; i<MyclsExcep.marks.length; i++){
		       try{
			     System.out.println("Student Name :" +MyclsExcep.name[i]+"\t" + "Student ID :" +MyclsExcep.id[i]+"\t" +"Attendance :"+MyclsExcep.att[i]+"\t"+"Marks :"+MyclsExcep.marks[i]);
				 if(MyclsExcep.att[i]<60){
				     throw new MyclsExcep(MyclsExcep.name[i]+"Secured less than 60 percentage of attendance");
					}
				}catch(MyclsExcep m){
				   System.out.println(m.getMessage());
				}
			}
		}
}		
		 