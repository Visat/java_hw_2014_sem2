/**
 *
 */
package Hw6_1;

import java.util.Date;

public class Hw6_1{
   
   public static void main(String[] args){
      Sale cashPay1 = new CashSale();
      CashSale cashPay2 = new CashSale(200.00);    
      Sale creditPay1 = new CreditCardSale();
      CreditCardSale creditPay2 = new CreditCardSale();
  
      cashPay1.setPayment(100.00);



      cashPay1.SaleDetails();
      cashPay2.SaleDetails();



   }


}


