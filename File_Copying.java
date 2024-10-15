package File_Copying;

import java.io.*;
import java.util.*;
class Main {
    public static void Read(String filename) throws FileNotFoundException, IOException{
        FileReader fr=new FileReader(filename);
        int i=fr.read();
        System.out.println("\nThe contents of "+filename+": ");
        while(i!=-1){
            System.out.print((char)i);
            i=fr.read();
        }
    }
    public static void Write() throws IOException{
        Scanner sc= new Scanner(System.in);
        FileWriter fw=new FileWriter("sample.txt");
        System.out.println("To STOP entering the contents, type END");
        System.out.println("Enter file contents: ");
        while(true){
            String i=sc.nextLine();
            if (i.equalsIgnoreCase("end")){
                break;
            }
            fw.write(i);
            fw.write('\n');
        }
        fw.flush();
        fw.close();
    }
    public static void Copy()throws FileNotFoundException, IOException{
        FileReader fr=new FileReader("sample.txt");
        FileWriter fw=new FileWriter("new_sample.txt");
        int i=fr.read();
        while(i!=-1){
            fw.write((char)i);
            i=fr.read();
        }
        fw.flush();
        fw.close();
        fr.close();
        System.out.println("\nContents Copied");
    }
    public static void main(String[] args)throws FileNotFoundException, IOException {
        Write();
        Read("sample.txt");
        Copy();
        Read("new_sample.txt");
    }
}