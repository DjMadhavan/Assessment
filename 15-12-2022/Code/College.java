import java.util.Scanner;
class College
{
public static void main(String []args)
  {
	Scanner sc=new Scanner(System.in);
	int s[][][]={
	{{57,47,67},{100,37,69}},
	{{78,87,88},{75,64,98}}
  };

	for(int i=0; i<s.length;i++)
	{
		System.out.println("Depart No."+(i+1));
	for(int j=0; j<s[i].length; j++)
	{
		System.out.println("Student No."+(j+1));
	for(int k=0; k<s[i][j].length; k++)
	{
		System.out.print(s[i][j][k] +"\t");
	}
	System.out.println();
	}
	}
  }


}
