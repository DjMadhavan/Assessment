import java.util.Scanner;
class Out{
	double b = 5000.0;
	public void calInterest(double roi){
		String p;
		System.out.println("Input the password : ");
		Scanner sc = new Scanner(System.in);
		p = sc.nextLine();
		if(p.equals("JavaDeveloper")){
			Inn in = new Inn();
			in.updateInterest(roi);
		}else{
			System.out.println("Not Matched");
		}
	}
	private class Inn{
		public void updateInterest(double roi){
			b+=b*(roi/100);
			System.out.println("Balance amount "+roi+" is "+b);
		}
	}
}
class Mainlog{
	public static void main(String... args){
		Out o = new Out();
		o.calInterest(20);
	}
}