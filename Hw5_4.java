/**
 * Input a series of numbers string and output a list for two columns :
 * N for the different elements
 * Count for the amounts of each element
 */

import java.util.Scanner;
import java.util.Arrays;

public class Hw5_4{

   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int[] inputArray = new int[50];
      int cnt = 0, cnt1 = 0, temp = 0, flag = 0;
      String str;
      str = input.nextLine();
      char[] arrayTemp = str.toCharArray();

   // Turn input string to integer array and sorting 
      while(cnt<str.length()){
	 if((cnt==str.length()-1) && (arrayTemp[cnt]!=' ')){
            temp = temp*10 + (arrayTemp[cnt] - '0');
            if(flag == 0){
	       inputArray[cnt1] = temp;
	    }
	    else{
               inputArray[cnt1] = (0-temp);
	       flag = 0;
	    }
   	 }
     	 else if(arrayTemp[cnt]!=' '){
	    if(arrayTemp[cnt]=='-'){
	       temp = 0;
	       flag = 1;
	    }
	    else{	    
            temp = temp*10 + (arrayTemp[cnt] - '0');
	    }
	 }
	 else{
	    if(flag == 0){
	       inputArray[cnt1] = temp; 
	       cnt1++;
	       temp = 0;
	    }
	    else{
               inputArray[cnt1] = (0-temp);
	       cnt1++;
	       temp = 0;
	       flag = 0;
	    }
	 }
         cnt++;
      }
      
      int[] reduceArray = new int[cnt1+1];
      for(int cnt2=0; cnt2<=cnt1; cnt2++){
         reduceArray[cnt2] = inputArray[cnt2];
      }
      Arrays.sort(reduceArray);

/* Debug : print the sorted array 
      for(int cnt2=0; cnt2<=cnt1; cnt2++){
         System.out.print(reduceArray[cnt2] + " ");
      }
*/
  
   // Cauculate different elements number
      int element = 1;
      int temp1 = reduceArray[0];
      for(int cnt2=0; cnt2<=cnt1; cnt2++){
	 if(reduceArray[cnt2] != temp1){
            element++;
	    temp1 = reduceArray[cnt2];
	 }
      }

   // Store different element and it's times
      int[][] list = new int[element][2];
      int count = 0, listCnt = 0;
      temp1 = reduceArray[cnt1];
      for(int cnt2=cnt1; cnt2>=0; cnt2--){
	 if(cnt2 == 0){
            if(reduceArray[cnt2] == temp1){
     	       list[listCnt][0] = temp1;
	       list[listCnt][1] = ++count;
	    }
	    else{
	       list[listCnt][0] = temp1;
	       list[listCnt][1] = count;
	       listCnt++;
	       list[listCnt][0] = reduceArray[cnt2];
	       list[listCnt][1] = 1;  
	    }
	 }
	 else if(reduceArray[cnt2] != temp1){
	    list[listCnt][0] = temp1;
            list[listCnt][1] = count;	    
            temp1 = reduceArray[cnt2]; 
	    count = 1;
            listCnt++;
	 }
	 else{
            count++;
	 }
      }

   // Print out the list
      System.out.println("      N   Count");
      for(int cnt2=0; cnt2<element; cnt2++){
         System.out.printf("%7d", list[cnt2][0]);
	 System.out.printf("   %d\n", list[cnt2][1]);
      }

   }

}

