/*
 * Develop the table of 100~10000 terms of pi value,
 * and let user input terms to get approximate of pi value.
 */

import java.util.Scanner;

class Hw3_4{

   private static double pi(int n){
      double piPos = 0.0;
      double piNeg = 0.0;
     
      for(int cnt=0; cnt<n; cnt++){
         piPos = piPos + (4/((double)cnt*4+1));
      }

      for(int cnt=1; cnt<n; cnt++){
         piNeg = piNeg + (4/((double)cnt*4-1));
      }
//      System.out.println(piPos + "\n" + piNeg);
      return piPos-piNeg;
   }


   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
       
      for(int cnt=100; cnt<=10000; cnt=cnt+100){
         System.out.println("Pi value of terms " + cnt + " : " + pi(cnt));
      }

      int n = input.nextInt();
      while(n<10000){
         System.out.println("The n value should over 10000. Please enter again.");
         n = input.nextInt();	 
      }
      System.out.println(pi(n));

   } 

}

