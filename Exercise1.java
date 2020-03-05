import java.util.* ; 
public class Exercise1 {
	public static void main(String[] args)
	{
		int x ; 
		int y ; 
		int z ; 
Scanner input = new Scanner(System.in) ; 
System.out.println("Enter a value for x") ; 
x = input.nextInt() ; 
System.out.println("Enter a value for y") ; 
y = input.nextInt(); 
System.out.println("Enter a value for z") ; 
z = input.nextInt() ; 
System.out.println("Your result is:" + ((3+4*x)/5 - 10*(y-5)/x + 9*(4/x + (9+x))/y)) ; 

	}
}