/**
 * Enter the stands amounts(>3) and enter info. for each stand bellow : 
 * 1. stand ID
 * 2. how many hotdogs can sell
 * 3. how many hotdogs sell instantly(if enter 0, then stop selling)
 * 
 * then program would print out the total amounts of the sold hotdogs.  
 */

import java.util.Scanner;

class HotDogStand{
// constructor overload
   public HotDogStand(){
      ID = 0;
      soldNum = 0;
      totalSold = 0;
   }
   public HotDogStand(int id, int sold){
      ID = id;
      soldNum = sold;
      totalSold = 0;
   }

   public void setSoldNum(int sold){
      soldNum = sold;
   }

   public int getSoldNum(){
      if(totalSold < soldNum)   return totalSold;
      else   return soldNum;
   }

   public int getID(){
      return ID;
   }

   public void justSold(int increment){
      totalSold += increment;
   }


// private section
   private int ID;
   private int soldNum;
   private int totalSold; 

}


public class Hw5_1{

   static int totalSold = 0;

   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the numbers of hotdog stands : ");
      int cnt=0;
      int id, soldNum;
      int sell=65535;
      int stands = input.nextInt();
      input.nextLine();
      if(stands<3){
         System.out.println("Stands to less, must > 3 !");
         System.out.print("Enter the numbers of hotdog stands : ");
	 stands = input.nextInt();
         input.nextLine();
      }
   // declare a series of HotDogSand class obj., but not initialize yet   
      HotDogStand[] hotDogStand = new HotDogStand[stands];

      while(cnt<stands){
	 System.out.print("Enter the stand ID : ");
	 id = input.nextInt();
         input.nextLine();
	 System.out.print("Enter the hotdog amounts of stand : ");
	 soldNum = input.nextInt();
	 input.nextLine();
         hotDogStand[cnt] = new HotDogStand(id,soldNum); 

	 while(sell>0 && hotDogStand[cnt].getSoldNum()<soldNum){
	    System.out.print("Hotdogs selling this time (0 to quit): ");
	    sell = input.nextInt();
	    input.nextLine();
            hotDogStand[cnt].justSold(sell);
            System.out.println("Hotdogs have sold now : "+hotDogStand[cnt].getSoldNum());

	 }

         totalSold += hotDogStand[cnt].getSoldNum(); 
	 System.out.println();
	 System.out.println("Stand<"+hotDogStand[cnt].getID()+"> sold : "+hotDogStand[cnt].getSoldNum()+" hotdogs.");
	 cnt++;
	 sell=65535;
	 System.out.println("> > > > > > ");
      }
      System.out.print("\nThe total sell of hotdogs : " + totalSold);

   }

}

