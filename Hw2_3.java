/**
 * Read a string in file and output it 
 * in big captal words and small captal words.
*/

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Hw2_3{

   public static void main(String[] args){
     
      Scanner fileIn = null;

      String fileName;
      String fileString;
//      fileName = args[0];
//      System.out.println(args[0]);

      try{
	 fileIn = new Scanner(
//	    new FileInputStream(args[0]) );
            new FileInputStream("input.txt") );
      }
      catch(FileNotFoundException error){
         System.out.println("File not found");
	 System.exit(0);
      } 

      if(fileIn.hasNextLine()){
         fileString = fileIn.nextLine();
	 System.out.println(fileString.toUpperCase());
	 System.out.println(fileString.toLowerCase());
      }   

   }

}

