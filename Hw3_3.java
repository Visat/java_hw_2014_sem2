/*
 * Calculate exponential value by Taylor expension with different x value,
 * output 3 accuracy , n=10,50,100.
 * Repeat calculation until user input -1.
 */

import java.util.Scanner;

class Hw3_3{

   private static double factorial(int n){
      if(n==1||n==0)   return 1;
      else   return n*factorial(n-1);
   } 

   private static double pow(int x, int times){
      double powx = x;
      for(int cnt=1; cnt<times; cnt++){
         powx *= x;
      }
      return powx;
   }

   private static double exp(int x, int n){
      double ex = 1.0;
      for(int cnt=1; cnt<=n; cnt++){
         ex += (pow(x,cnt)/factorial(cnt));
      }
      return ex;
   }

   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int x = 0;
      System.out.println("(Enter x value, x>=0, -1 to escape.)");
     
      while( (x = input.nextInt()) != -1 ){
         if(x<-1){
	    System.out.println("x value error!");
	    System.exit(1);
	 }
         System.out.println("Take n=10 , exp^" + x + " = " + exp(x,10)  );
         System.out.println("Take n=50 , exp^" + x + " = " + exp(x,50)  );
         System.out.println("Take n=100, exp^" + x + " = " + exp(x,100) );
      }
   }

}

