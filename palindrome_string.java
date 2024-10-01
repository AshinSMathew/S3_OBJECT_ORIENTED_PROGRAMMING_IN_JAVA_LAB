import java.util.*;
public class palin{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int flag=0;
		System.out.print("Enter a String ");
		String str=scan.nextLine().toLowerCase();
		int len=str.length();
		for(int i=0;i<len;i++){
			if(str.charAt(i)!=str.charAt(len-i-1)){
				flag=1;
				break;
			}
		}
		if(flag==1){
			System.out.println(str+" is NOT PALINDROME");
		}
		else{
			System.out.println(str+" is PALINDROME");
		}
	}
}
