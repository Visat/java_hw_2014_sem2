import java.util.Scanner;
//import java.util.*;

/*calculate how many times can */
class Hw1_2{

   public static void main(String[] args){
      long minuend;      // ³Q´î¼Ædeclaration
      long subtrahend;   // ´î¼Ædeclaration
      long times = 0;
      long temp;      

      Scanner input = new Scanner(System.in);
      System.out.printf("Please enter the minuend : ");
      minuend = input.nextLong();
      System.out.printf("Please enter the subtrahend : ");
      subtrahend = input.nextLong();
      temp = minuend;

      while(temp > subtrahend){
         temp = temp - subtrahend;
	 times++;
      }

      System.out.println("> > > > >\n" + minuend + " can subtract " + subtrahend + " : " + times + " times");
      System.out.println("Remainder is : " + temp);

   }

}

