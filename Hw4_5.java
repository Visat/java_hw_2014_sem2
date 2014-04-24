/**
 *
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Scanner;

public class Hw4_5{
public static void main(String[] args){
   int[] rate;
   int[] rateTmp;
   String[] productName;

   rate = new int[5];
   rateTmp = new int[5];
   productName = new String[5];
   
   Scanner fileIn = null;
   String fileContent;
   int cnt = 0, cnt2 = 0;

   try{
      fileIn = new Scanner(
		 new FileInputStream("input.txt"));
   }
   catch(FileNotFoundException error){
      System.out.println("File not found");
      System.exit(0);
   }      
   int cnt3 = 0;
      System.out.println("The average rate : ");
   while(fileIn.hasNextLine()){
      fileContent = fileIn.nextLine();
      StringTokenizer st = new StringTokenizer(fileContent, ",");
      if(cnt == 0){
         for(int cnt1=0; cnt1<5; cnt1++){
            productName[cnt1] = st.nextToken();
	    System.out.print(productName[cnt1]+ "  ");
         }
	 System.out.println();
         cnt++;
      }else{
      for(int cnt1=0; cnt1<5; cnt1++){
         rateTmp[cnt1] = (st.nextToken().charAt(0) - '0');
      }

      for(int cnt1=0; cnt1<5; cnt1++){
         rate[cnt1] += rateTmp[cnt1];
//         System.out.print(rate[cnt1] + "  ");
      }
//      System.out.println();
      cnt++;
      }
   cnt3++;
   }
         for(int cnt1=0; cnt1<5; cnt1++){
      System.out.print(rate[cnt1]/(cnt3-1) + "  ");
      }


   }


}

