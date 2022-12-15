import java.util.Scanner;

 class Temp {

    public static void main(String args[])
       {
        Scanner sc = new Scanner(System.in);
		int a[][]=new int[2][6];
		int b[]=new int[2];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("City daily temp is" +(i+1));
			for(int j=0;i<a[i].length;j++)
			{
				System.out.println("Enter daily temp " +j);
				a[i][j]=sc.nextInt();				
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;i<a[i].length;j++)
			{
				b[i]+=a[i][j];
			}
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.println("Temp Weekly report" +(i+1) +"is" + (b[i]/6));
		}
	   }
 }