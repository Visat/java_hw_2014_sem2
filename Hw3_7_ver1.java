/*
 * enter a string that do two integer addition or subtraction
 * and print out the result 
 */

import java.util.Scanner;

class Hw3_7_ver1{

   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      input.useDelimiter("\\s*[+,-]?\\s*"); // regular expr, set equation form
      String str = input.nextLine();
      char c = '\0';
      int var1=0, var2=0;

// grab operator from string  
      for(int cnt=0; cnt<str.length(); cnt++){
         if(str.charAt(cnt) == '+' || str.charAt(cnt) == '-'){
	    c = str.charAt(cnt);
	    break;
	 }
      }

// if not addition and subtraction then quit program
      if(c != '+' && c != '-'){
         System.out.println("Operation not support!");
	 System.exit(1);
      }

// calculation, seperate add and sub      
      if(c == '+'){
         String[] s = str.split("\\+");
//         System.out.println(s[0] + "\n" + s[1]);
      // convert string to int
	 for(int cnt=0; cnt<s[0].length(); cnt++){
            if(s[0].charAt(cnt) != ' '){
               var1 = var1*10 + (s[0].charAt(cnt) - '0');
	    }
	 }
	 for(int cnt=0; cnt<s[1].length(); cnt++){
            if(s[1].charAt(cnt) != ' '){
               var2 = var2*10 + (s[1].charAt(cnt) - '0');
	    }
	 }
         System.out.println(var1+var2);
      }
      else if(c == '-'){
         String[] s = str.split("\\-");
//         System.out.println(s[0] + "\n" + s[1]);

	 for(int cnt=0; cnt<s[0].length(); cnt++){
            if(s[0].charAt(cnt) != ' '){
               var1 = var1*10 + (s[0].charAt(cnt) - '0');
	    }
	 }
	 for(int cnt=0; cnt<s[1].length(); cnt++){
            if(s[1].charAt(cnt) != ' '){
               var2 = var2*10 + (s[1].charAt(cnt) - '0');
	    }
	 }
	 System.out.println(var1-var2); 
      }

   }

}

