import java.util.*; 
public class Exercise3 
{
	public static void main(String [] args)
	{
		double amt ; 
		int convert; 
Scanner input = new Scanner(System.in) ; 
System.out.println("Please enter an amount to convert (number value only)"); 
amt = input.nextInt() ; 

//Ask user to enter 1 or 2
System.out.println("Enter 1 or 2") ; 
convert = input.nextInt() ; 
if (convert == 1)
{
	System.out.println("You entered " + amt + " dollars which equals " + amt*.9 + " Euros") ; 
}
else
{
	System.out.println("You entered " + amt + " Euros which equals " + amt*(1.1) + " dollars") ; 

}
}


	}
