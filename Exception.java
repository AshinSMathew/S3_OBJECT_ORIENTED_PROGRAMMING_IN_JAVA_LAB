import java.util.*;
public class Main {
	public static float divide(float a, float b) throws ArithmeticException{
		if (b==0) {
			throw new ArithmeticException("Cannot divide with Zero");
		}	
		return a/b;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter two numbers to divide");
		float a=sc.nextFloat();
		float b=sc.nextFloat();
		try {
			System.out.println(divide(a,b));
		}
		catch(Exception ae) {
			System.out.println("Exception: "+ae.getMessage());
		}
		finally {
			System.out.println("END");
		}
		sc.close();
	}
}