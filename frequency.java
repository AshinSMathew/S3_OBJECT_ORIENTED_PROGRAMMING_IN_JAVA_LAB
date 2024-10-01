import java.util.*;
public class frequency{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a string ");
		String str=scan.nextLine().toLowerCase();
		System.out.print("Enter a character ");
		char c=scan.next().toLowerCase().charAt(0);
		int len=str.length();
		int count=0;
		for(int i=0;i<len;i++){
			if (c==str.charAt(i)){
				count=count+1;
			}
		}
		System.out.println(c+" is present "+count+" times in "+str);
	}
}
