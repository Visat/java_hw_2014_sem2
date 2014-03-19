/**
*  Enter the radius and print out : 
*  1. diameter, 2. circumference, 3. area
*/

import java.util.Scanner;

class Hw2_2{

   public static void main(String[] args){
      double pi = 3.14159;
      double radius = 0.0;

      Scanner input = new Scanner(System.in);

      System.out.print("Please enter the radius : ");
      radius = input.nextDouble();
      System.out.println("> > > > > ");
      System.out.println("The diameter is : " + radius*2);
      System.out.println("The circumference is : " + radius*2*pi);
      System.out.println("The area is : " + radius*radius*pi);

   }

}

