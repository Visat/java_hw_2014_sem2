/**
 *  Set the radius and print out diameter, circumference, area.
 *  C1 uses parameter ,C2 uses default constructor to set the radius. 
 */

import java.util.Scanner;

class Circle{

   public Circle(){
      radius = 0.0;
      pi = 3.14;
   }
   public Circle(double r){
      radius = r;
      pi = 3.14;
   }

   public void setRadius(double r){
      radius = r;
   }

   public double getRadius(){
      return radius;
   }

   public void display(){
      System.out.println("Diameter : " + (radius*2) );
      System.out.println("Circumference : " + (radius*pi*2) );
      System.out.println("Area : " + (radius*radius*pi) );   
   }

   public String toString(String s){
      return s;
   }

   public boolean equals(Circle theOther){
      if(theOther.getRadius() == radius) return true;
      else return false;
   } 

// private section-----------------------
   private double radius, pi;

}

public class Hw4_4{
   public static void main(String[] args){
      double radius = 0.0;
      Scanner input = new Scanner(System.in);
      Circle c1 = new Circle(1);
      Circle c2 = new Circle();
      System.out.println("Circle 1");
      c1.display();
      System.out.println("> > > > > > ");

      System.out.print("Set radius of Circle 2 : ");
      radius =input.nextDouble();
      System.out.println("Circle 2");
      c2.setRadius(radius);
      c2.display();
      System.out.print("If C1 = C2 ? : " + c2.equals(c1));
      System.out.println();

   }

}

