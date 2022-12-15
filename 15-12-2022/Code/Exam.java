import java.util.Scanner;

 class Exam {

    public static void main(String args[])
       {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number : ");
        int a = sc.nextInt();
        int b = 0;
    
        for(int i=0; i<a; i++)
        {
            if(i*(i+1) == 2)
            {
                b = 1;
                break;
            }
        }
         
        if(b == 1)
            System.out.println("Pronic Number.");
        else
            System.out.println("Not a Pronic Number.");      
    }
}