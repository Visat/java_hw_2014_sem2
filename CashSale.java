package Hw6_1;

import Hw6_1.Sale;

public class CashSale extends Sale{

   public CashSale(){}
   public CashSale(double amounts){
      payment = amounts;
   }

   public void SaleDetails(){
      System.out.println("The amount pay by cash is : "+payment);
   } 

}

