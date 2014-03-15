/**
 *  糤瞯1.14% –き糤瞯搭ぶ1.1%璸衡计
 *  ㏕﹚10计2016㎝2021计の糤计
 *  琵ㄏノ块饼琩高
 */

import java.util.Scanner;

class Hw1_5{

   public static double populationCal(double population, double rate, int years){
      int cnt, times;
      double popTemp;
      times = years - 2014;
      popTemp = population;
      for(cnt=1; cnt<=times; cnt++){
         popTemp = popTemp * (1+rate);
	 if(cnt%5 == 0)   rate = rate - 0.00011;         
      }
      
      return popTemp;
   }



   public static void main(String[] args){
      double population = 700000000.0;
      double growthRate = 0.0114;
      double popLater;
      int cnt, times, years;
      Scanner input = new Scanner(System.in);

      System.out.println("The world population 10 years from now is : " + (int)populationCal(population, growthRate, 2024));
      System.out.println("> > > > >");
      popLater = populationCal(population, growthRate, 2016);
      System.out.println("The population in 2016 is : " + (int)popLater);
      System.out.println("The population incresement in 2016 is : " + ((int)popLater - (int)population) + " people");
      popLater = populationCal(population, growthRate, 2021);
      System.out.println("The population in 2021 is : " + (int)popLater);
      System.out.println("The population incresement in 2021 is : " + ((int)popLater - (int)population) + " people");
      System.out.println("> > > > > ");

      // user input interface
      System.out.print("Please enter the year : ");
      years = input.nextInt();

      if(years < 2014){
         System.out.println("The years is wrong! Exit the program.");
	 System.exit(1);
      }

      popLater = populationCal(population, growthRate, years);
      System.out.println("The population in " + years + " is : " + (int)popLater);
      System.out.println("The increacement of population is " + ((int)popLater - (int)population) + " people");

   }

}

