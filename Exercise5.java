import java.util.*; 
public class Exercise5 

{
	public static void main (String [] args) 
	{
		int x ; 
		int y ; 
		Scanner input = new Scanner(System.in) ; 
		System.out.print("Enter first integer "); 
		x = input.nextInt() ; 
		System.out.print("Enter second integer ") ; 
		y = input.nextInt() ; 
		System.out.println("Sum of " + x + " and " + y + " =" + (x+y)) ; 
		System.out.println(x + " minus " + y + " =" + (x-y)) ; 
		System.out.println("Divison: " + (x/y)) ;
		System.out.println("Multiplication: " + (x*y)) ; 
		System.out.println("Remainder: " + (x%y)) ; 

	}
}