import java.util.Scanner;

class Calculate{
// public-----------------------------
      public Calculate(){
         len = 0.0;
         wid = 0.0;
      }   //constructor
  
      public void setLength(double l){
         len = l;
      }

      public void setWidth(double w){
         wid = w;
      }

/*
      int getLength(){
         return len;
      }

      double getWidth(){
         return wid;
      } 
*/

      public double getTotalCost(){
         return (len+wid)*2*1.75;       
      }

// private-----------------------------
      private double len;
      private double wid;
}


class Hw1_1{

   public static void main(String[] args){
      double len_tmp, wid_tmp, total_tmp;
      Scanner input = new Scanner(System.in);   // create Scanner to obtain input
      Calculate cal = new Calculate();            // create Calculate obj. cal 

      System.out.println("Please enter the length of your garden : ");
      len_tmp = input.nextDouble();
      System.out.println("Please enter the Width  of your garden : ");
      wid_tmp = input.nextDouble();

      cal.setLength(len_tmp);
      cal.setWidth (wid_tmp);

      System.out.println("Total cost of your garden is : $" + cal.getTotalCost());
            
   }

}

