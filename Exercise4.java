import java.util.*;
public class Exercise4 
{
	public static void main (String [] args) 
	{
		String grade ; 
		double min ; 
		double current ; 
		double percent ; 
		double desired ;

		Scanner input = new Scanner(System.in) ; 
		System.out.print("Enter desired course grade: ") ; 
		grade = input.nextLine() ; 
		System.out.print("Enter minimum avg required: ") ; 
		min = input.nextDouble() ; 
		System.out.print("Enter current avg: ") ; 
		current = input.nextDouble() ; 
		System.out.print("Enter how much the final counts as a percentage of your grade: ") ; 
		percent = input.nextDouble() ; 
		desired = (min-(current*(1-percent))/percent); 


		System.out.println("You need to get a " + desired + " on your final") ; 



	}
}