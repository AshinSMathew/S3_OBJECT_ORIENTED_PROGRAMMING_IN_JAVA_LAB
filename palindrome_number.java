import java.util.Scanner;
public class palindrome{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a number ");
		int num=scan.nextInt();
		int temp,rev=0;
		temp=num;
		while(num>0){
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(rev==temp){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not Palindrome");
		}
		
	}
}
