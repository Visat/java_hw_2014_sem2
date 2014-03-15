/**
 * use String class method : replaceFirst(String, String) 
 * to replace the first assignment word to the other word
 */

import java.util.Scanner;

class Hw1_4{

   public static void main(String[] args){
      String s;
      Scanner input = new Scanner(System.in);

      System.out.print("Please enter a sentence : ");

      s = input.nextLine();
      s = s.replaceFirst("hate", "love");

      System.out.println("The sentence after processing is : " + s);

   }

}

