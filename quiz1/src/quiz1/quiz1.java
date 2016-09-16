package quiz1;
import java.util.Scanner; 
public class quiz1 {
	public static double test(double x){
		if (x>2.375){
			x=2.375;
		}
		else if (x<0){
			x=0;
		}
		else{
			return x;
			
		}
		return x;
	}
	public static void main(String[] args){

		Scanner datainput=new Scanner(System.in);

			

			System.out.print("Enter the Number of passing attempts :");

			double ATT=datainput.nextDouble();

			

			System.out.print("Enter the Number of completions :");

			double COMP=datainput.nextDouble();

			

			System.out.print("Enter the Passing yards :");

			double YDS=datainput.nextDouble();

			

			System.out.print("Enter the Touchdown passes:");

			double TD=datainput.nextDouble();

			

			System.out.print("Enter the Interceptions :");

			double INT=datainput.nextDouble();
			

			datainput.close();     
			
		double a=(COMP/ATT-0.3)*5;
		double b=(YDS/ATT-3)*0.25;
		double c=(TD/ATT)*20;
		double d=2.375-(INT/ATT*25);
		
		test(a);
		test(b);
		test(c);
		test(d);
		
		double PasserRating=((a+b+c+d)/6)*100;
		System.out.printf("The passer rating is %.2f",PasserRating);
		
			
	}
	
}
	
