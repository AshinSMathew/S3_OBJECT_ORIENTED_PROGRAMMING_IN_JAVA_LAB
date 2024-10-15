
import java.io.*;
import java.util.*;
public class Main {
          public static void Read(String filename) throws FileNotFoundException, IOException{
                      FileReader fr=new FileReader(filename);
                      int i=fr.read();
                      System.out.println("\nThe contents of "+filename+" : ");
                      while(i!=-1){
                                   System.out.print((char)i);
                                   i=fr.read();
                     }
                     fr.close();
          }
          public static void Write()throws IOException{
                      FileWriter fw=new FileWriter("numbers.txt");
                      Scanner sc =new Scanner(System.in);
                      System.out.println("To stop entering, type 0");
                      System.out.println("Enter Number:");
                      while(true){
                                   int i=sc.nextInt();
                                   if(i==0){
                                	   break;
                                   }
                                   fw.write(i+"\n");
                     }
                     fw.close();
          }
          public static void Odd_Even()throws FileNotFoundException, IOException{
                     FileWriter fwe = new FileWriter("even.txt");
                     FileWriter fwo = new FileWriter("odd.txt");
                     FileReader fr= new FileReader("numbers.txt");
                     String number="";
                     int i=fr.read();
                     while(i!=-1){
                                    if(i !='\n'){
                                    	number+=(char)i;
                                    }else{
                                    	int num=Integer.parseInt(number);
                                    	if(num%2==0) {
                                    			fwe.write(num+"\n");
                                    	}
                                    	else {
                                    			fwo.write(num+"\n");
                                    	}
                                    	number="";
                                    }
                                    i=fr.read();
                    }
                    fr.close();
                    fwe.close();
                    fwo.close();
                    
           }
           public static void main(String[] args) throws FileNotFoundException, IOException {
                    Write();
                    Read("numbers.txt");
                    Odd_Even();
                    Read("even.txt");
                    Read("odd.txt");
           }
}
