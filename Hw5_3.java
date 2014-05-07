/**
 * Enter 2 fraction and compare if they are equal or not
 */

import java.util.Scanner;

class Fraction{
// Constructor overload
   public Fraction(){
      numerator = 0;
      denominator = 1;
   }
   public Fraction(int num, int denom){
      numerator = num;
      denominator = denom;
   }

// Set fraction
   public void setNumer(int n){
      numerator = n;
   }

   public void setDenom(int d){
      denominator = d;
   }

// Reduce the fraction
   public void reduce(){
      int g = gcd(numerator, denominator);
      numRedu = numerator / g;
      denomRedu = denominator / g;  
   }

// Compare two fractions is equal or not   
   public boolean equals(Fraction theOther){
      reduce();
      theOther.reduce();
      if(theOther.numRedu == numRedu && theOther.denomRedu == denomRedu){
         return true;
      }
      else{   
	 return false;
      }
   }

// Print out the fraction in a/b
   public void displayFraction(){
      System.out.print(numerator+"/"+denominator);
   }

   public int numRedu;
   public int denomRedu;


// private section------------------------
   private int gcd(int a, int b){
      int temp;
      if(a<b){
         temp = a;
	 a = b;
	 b = temp;
      }
      while(a%b != 0){
         temp = b;
	 b = a%b;
	 a = b;
      }
      return b;
   }

   private int numerator;
   private int denominator;

}

public class Hw5_3{

   public static void main(String[] args){
      Scanner input = new Scanner(System.in);

      int num1,num2,demon1,demon2;

      Fraction f1 = new Fraction();
      Fraction f2 = new Fraction();

      System.out.print("Enter the numerator of first fraction : ");
      f1.setNumer(input.nextInt());
      input.nextLine();
      System.out.print("Enter the denominator of first fraction : ");
      f1.setDenom(input.nextInt());
      System.out.print("Enter the numerator of second fraction : ");
      f2.setNumer(input.nextInt());
      input.nextLine();
      System.out.print("Enter the denominator of second fraction : ");
      f2.setDenom(input.nextInt());
      input.nextLine();
      System.out.print("> > > > > >\n");

      System.out.print("Fraction 1 (");
      f1.displayFraction();
      System.out.print(") and Fraction 2 (");
      f2.displayFraction();
      System.out.print(") are equal? : ");
      System.out.print(f1.equals(f2));
      System.out.println();

   }

}

