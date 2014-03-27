/**
 * Read the person information including name and height,
 * and output his ideal weight.
 * Ideal weight : basic 110 pounds, over 5 feet, an inch adds 5 pounds.
 */

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

class idealWeight{
//public section   
   public idealWeight(int feet, int inch){   // constructor
      heightInch = 12*feet + inch;
      weightPound = 110;
   }

   public int getIdealWeight(){   //practice to conceal process
      return calculateWeight(heightInch, weightPound);
   }

//private section
   private int heightInch, weightPound; 

   private int calculateWeight(int hei, int wei){
      int weiTemp;
      weiTemp = wei + (hei-60)*5;
      return weiTemp;
   }

}


class Hw2_5{

   public static void main(String[] args){
      Scanner fileIn = null;
//      Scanner input = new Scanner(System.in);

//      String fileName;
      String name;
      int heightInch, heightFeet, weight;

//      System.out.print("Please enter the file name : ");
//      fileName = input.nextLine();

      try{
         fileIn = new Scanner(
//	           new FileInputStream(fileName) );
	           new FileInputStream("input.txt") );
      }
      catch(FileNotFoundException error){
         System.out.println("File not found.");
	 System.exit(0);
      }

      while(fileIn.hasNextLine()){
         name = fileIn.nextLine();
         heightFeet = fileIn.nextInt();
	 heightInch = fileIn.nextInt();
	 if(fileIn.hasNextLine())   fileIn.nextLine();

         idealWeight iweight = new idealWeight(heightFeet, heightInch);
         weight = iweight.getIdealWeight();
	 System.out.println(name + " " + weight + '\n');
      }

   }

}

