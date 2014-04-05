/*
 * Use Babylonian algorithm to compute the square root,
 * output the answer in .2f,
 * enter negative number or 0 to quit the program.
 */

import java.util.Scanner;

class Hw3_1{

   public static void main(String[] args){

      Scanner input = new Scanner(System.in);
      double sample = 0.0, root = 0.0, 
	     guess1 = 0.0, guess2 = 0.0;
      double seperateRate = 0.0;

      while( (sample = input.nextDouble()) > 0 ){
      // first guess
     	 guess1 = sample/2;
      // first calculation
	 root = sample / guess1;
	 guess2 = (guess1+root) / 2;
	 seperateRate = (guess1-guess2) / guess2;
      // loop calculation
	 while(seperateRate > 0.01){
            guess1 = guess2;
            root = sample / guess1;
	    guess2 = (guess1+root) / 2;
	    seperateRate = (guess1-guess2) / guess2;
	 }

	 System.out.printf("%.2f\n",guess2);
      }	      

   }   

}

