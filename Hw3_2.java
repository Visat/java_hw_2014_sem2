/*
 * Input numbers of received and possible data 
 * and output the sum of each data and the rate.
 */

import java.util.Scanner;

class Hw3_2{

   public static void main(String[] args){

      Scanner input = new Scanner(System.in);
      System.out.println("How many exercises to input?");
      int times = input.nextInt();
      double receivedScore = 0.0;
      double possibleScore = 0.0;
      double rate = 0.0;
      
      for(int cnt=0; cnt<times; cnt++){
         System.out.println("Score received for exercise "+(cnt+1)); 
         receivedScore += input.nextInt();
         System.out.println("Total points possible for exercise "+(cnt+1));
         possibleScore += input.nextInt();	 
      }

      rate = (receivedScore/possibleScore)*100;

      System.out.print("Your total is "+(int)receivedScore+" out of "+(int)possibleScore+", or ");
      System.out.printf("%.2f",rate);
      System.out.println("%.");
      
   }

}

