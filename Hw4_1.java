/**
 * Print the Beer Song with words (no integer number)
 * input the bottles number and output the lyrics (>99 seem as 99, <0 seem as 0)
 */

import java.util.Scanner;

class BeerSong{
// Constructor overloading : initialize beerNumber	
   public BeerSong(){   
      beerNumber = 99;
   }

   public BeerSong(int inputAmount){
      if(inputAmount > 99){
         beerNumber = 99;
      }
      else if(inputAmount < 0){
         beerNumber = 0;
      }
      else{
         beerNumber = inputAmount;
      }
   }

// Method : print out the lyrics
   public void printSong(){
      for(int cnt=beerNumber; cnt>=0; cnt--){
         if(cnt>1){
     	    System.out.println(convertItoS(cnt)+" bottles of beer on the wall,");
	    System.out.println(convertItoS(cnt)+" bottles of beer,");
	    System.out.println("Take one down, pass it around,");
	 }
	 else if(cnt == 1){
     	    System.out.println(convertItoS(cnt)+" bottle of beer on the wall,");
	    System.out.println(convertItoS(cnt)+" bottle of beer,");
	    System.out.println("Take one down, pass it around,");	      
	 }
	 else{
            System.out.println(convertItoS(cnt)+" bottle of beer on the wall.");
	 }
      }
   }


// private section----------------------------  
   private int beerNumber;

// Change integer to words and return a string   
   private String convertItoS(int integer){
      int tens=0, units=0;
   // Seperate integer to tens digit and units digit and store as string
      tens = integer/10;
      units = integer - tens*10;
      
      if(tens == 0){   // unit process
         if(units == 0) return "Zero";
	 else if(units == 1) return "One";
	 else if(units == 2) return "Two";
         else if(units == 3) return "Three";
         else if(units == 4) return "Four";
         else if(units == 5) return "Five";
	 else if(units == 6) return "Six";
	 else if(units == 7) return "Seven";
	 else if(units == 8) return "Eight";
	 else if(units == 9) return "Nine";
      }
      else if(tens == 1){   // tens process
         if(units == 0){return "Ten";}
	 else if(units == 1) return "Eleven";
	 else if(units == 2) return "Twelve";
         else if(units == 3) return "Thirteen";
         else if(units == 4) return "Fourteen";
         else if(units == 5) return "Fifteen";
	 else if(units == 6) return "Sixteen";
	 else if(units == 7) return "Seventeen";
	 else if(units == 8) return "Eighteen";
	 else if(units == 9) return "Ninteen";
      }	 
      else{
	 if(tens == 2){return "Twenty"+convertUnit(units);}
         else if(tens == 3) return "Thirty" +convertUnit(units);
         else if(tens == 4) return "Forty"  +convertUnit(units);
         else if(tens == 5) return "Fifty"  +convertUnit(units);
	 else if(tens == 6) return "Sixty"  +convertUnit(units);
	 else if(tens == 7) return "Seventy"+convertUnit(units);
	 else if(tens == 8) return "Eighty" +convertUnit(units);
	 else if(tens == 9) return "Ninety" +convertUnit(units);
      }
      return "error";
   }

// Units attach to the tens
   private String convertUnit(int unit){
         if(unit == 0) return "";
	 else if(unit == 1) return "-one";
	 else if(unit == 2) return "-two";
         else if(unit == 3) return "-three";
         else if(unit == 4) return "-four";
         else if(unit == 5) return "-five";
	 else if(unit == 6) return "-six";
	 else if(unit == 7) return "-seven";
	 else if(unit == 8) return "-eight";
	 else if(unit == 9) return "-nine";
         else return "error";
   }

}// end of class BeerSong


public class Hw4_1{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.print("Please enter the number of bottles : ");
      int bottles = input.nextInt();
      BeerSong song = new BeerSong(bottles);
      song.printSong();
   }
}

