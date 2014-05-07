package Hw6_1;

import Hw6_1.*;

public class Sale{

   public Sale(){
      payment = 0.0;
   }

   public Sale(double payValue){
      payment = payValue;
   }

   public void SaleDetails(){
      System.out.println("The amount of the payment is : "+payment);
   }
   public void setPayment(double set){
      payment = set;
   }

   protected double payment;
}

