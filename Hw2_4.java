/**
 * Read the file and do :
 * (1) output the whole content
 * (2) change the first word "hate" to "love"
 */

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

class Hw2_4{

   public static void main(String[] args){
      Scanner fileIn = null;
//      Scanner input = new Scanner(System.in);

//      String fileName;
      String fileContent;
      
//      System.out.print("Please enter the file name : ");
//      fileName = input.nextLine();

      try{
         fileIn = new Scanner(
//		   new FileInputStream(fileName) );
                   new FileInputStream("input.txt") );
      }
      catch(FileNotFoundException error){
         System.out.println("File not found");
	 System.exit(0);
      } 

      while(fileIn.hasNextLine()){
	 fileContent = fileIn.nextLine();
	 fileContent = fileContent.replaceFirst("hate", "love"); 
         System.out.println(fileContent);
      }

   }
 
}

