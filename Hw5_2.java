/**
 * Enter 4 quarters sells data and
 * 1. print out the figure of sells condition of 5 companies in 4 quarters
 * 2. print out the sells sum and average of 5 companies in 4 quarters
 * 3. print out the sells sum and average of 4 quarters
 * 4. highlight the best sells company in each quarters
 */

import java.util.Scanner;
import java.util.Arrays;

public class Hw5_2{
// Blank constructor
    public Hw5_2(){;}

// Total sales method overloading
   public static int totalSale(int[][] arrayData){
      int total=0;
//      for(int cnt=0; cnt<arrayData.length; cnt++){
// 	 for(int cnt1=0; cnt1<arrayData[].length; cnt1++){
	for(int cnt=0; cnt<5; cnt++){
	   for(int cnt1=0; cnt1<4; cnt++){
            total += arrayData[cnt][cnt1];
	 }
      }
      return total;
   }
   public static int totalSale(int[][] arrayData, int n, int mode){
      int totalPart=0;
   // m=1, return company total sales 
      if(mode==1){
         for(int cnt=0; cnt<4; cnt++){
            totalPart += arrayData[n][cnt];
         }
      }
   // m=2, return quarter total sales
      else if(mode==2){
         for(int cnt=0; cnt<5; cnt++){
	    totalPart += arrayData[cnt][n];	 
	 }
      }
      return totalPart;
   }

// Return average number in double type
   public static double average(int total, int per){
      return (double)total / (double)per;
   }

// Return the biggest sells number of the quarter
   public static int bestSaleQua(int[][] arrayData, int quarter){
      int[] temp = new int[5];
      for(int cnt=0; cnt<5; cnt++){
         temp[cnt] = arrayData[cnt][quarter];
      }
      Arrays.sort(temp);
      return temp[4];
   }

// Print sales figures on screen   
   public static void printFigure(int[][] arrayData){
      System.out.println("Company    Qu1       Qu2       Qu3       Qu4       Total      Average");
      for(int cnt=0; cnt<5; cnt++){
	 System.out.printf("%4d",cnt+1);
         for(int cnt1=0; cnt1<4; cnt1++){
            System.out.printf("%10d", arrayData[cnt][cnt1]);
	 }
	 System.out.print(" |");
	 System.out.printf("%10d", totalSale(arrayData,cnt,1));
	 System.out.printf("%13.2f", average(totalSale(arrayData,cnt,1),4));
	 System.out.println();	 
      }
      System.out.println("----------------------------------------------");
      System.out.print(" Total ");
      for(int cnt=0; cnt<4; cnt++){
         if(cnt==0){
            System.out.printf("%7d", totalSale(arrayData,cnt,2));
	 }
	 else{
     	    System.out.printf("%10d", totalSale(arrayData,cnt,2));
	 }
      }
      System.out.println();
      System.out.print("  Avg");
      for(int cnt=0; cnt<4; cnt++){
         if(cnt==0){
            System.out.printf("%9.1f", average(totalSale(arrayData,cnt,2),5));
	 }
	 else{
            System.out.printf("%10.1f", average(totalSale(arrayData,cnt,2),5));
	 }
      }
      System.out.println();
      System.out.println("> > > > > > > > ");
      for(int cnt=0; cnt<4; cnt++){
         System.out.print("The best sells in quarter \""+(cnt+1)+"\" is : ");
	 for(int cnt1=0; cnt1<5; cnt1++){
            if(arrayData[cnt1][cnt] == bestSaleQua(arrayData, cnt)){
               System.out.print("Company <"+(cnt1+1)+"> ");
	    }
	 }
         System.out.println();
      }
   }   


// Main method
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int[][] companySellData = new int[5][4];

      for(int cnt=0; cnt<5; cnt++){
         System.out.println("Enter company <"+(cnt+1)+"> sales data : ");
	 for(int cnt1=0; cnt1<4; cnt1++){
 	    System.out.print("quarter \""+(cnt1+1)+"\" : ");
            companySellData[cnt][cnt1] = input.nextInt();
	    input.nextLine();
	 }
	 System.out.println("- - - - - ");
      }
      System.out.println();
      printFigure(companySellData);
   }

}

