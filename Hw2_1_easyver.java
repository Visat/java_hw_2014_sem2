/**
 * Enter three integer numbers and calculate summation and average
 * the average is to (.4f)
 */

import java.util.Scanner;

class Hw2_1_easyver{

   public static void main(String[] args){
      int[] inputNum = new int[3];
      int sum = 0;
      double average = 0.0;      
      int cnt;
      
      Scanner input = new Scanner(System.in);

      System.out.print("Please enter 3 numbers : "); 

      for(cnt=0; cnt<3; cnt++){
         inputNum[cnt] = input.nextInt();         
         sum += inputNum[cnt];
      }      
      average = (double)sum/3;

      System.out.println("> > > > > ");
      System.out.println("The sum is : " + sum);
      System.out.printf("The average is : %.4f", average);

   }

}

