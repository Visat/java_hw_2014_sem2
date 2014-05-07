package Hw6_1;

import java.util.Date;
import Hw6_1.*;

public class CreditCardSale extends Sale{

   public CreditCardSale(){}

   public void SaleDetails(){
      System.out.println("The owner of the credit card : "+name);
      System.out.println("The expiration date of the credit card : "+expirationDate);
      System.out.println("The number of the credit card : "+cardNumber);
   }

   private String name;
   private Date expirationDate;
   private int cardNumber; 
}

