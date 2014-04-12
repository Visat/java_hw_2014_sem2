/**
 * Do two complex numbers addition and subtraction.
 * The first complex numbers input seperately from real(a) and complex(b),
 * second complex numbers input the whole string (a+bi/a-bi).
 */

import java.util.Scanner;

class Complex{
// Constructor
   public Complex(){
      realNum = 0;
      cpxNum = 0;
      argNum = 0;
      argCpx = 0;
   }

// Set up the complex number
   public void setReal(int real){
      realNum = real;
   }

   public void setCpx(int cpx){
      cpxNum = cpx;
   }

// Do two complex numbers addition   
   public Complex complexAddition(String otherCpx){
      stringtoInt(otherCpx);
      int realTmp=0, cpxTmp=0;
      realTmp = realNum + argNum;
      cpxTmp = cpxNum + argCpx;
      Complex add = new Complex();
      add.setReal(realTmp);
      add.setCpx(cpxTmp);
      return add;
   }

// Do two complex numbers subtraction  
   public Complex complexSubtraction(String otherCpx){
      stringtoInt(otherCpx);
      int realTmp=0, cpxTmp=0;
      realTmp = realNum - argNum;
      cpxTmp = cpxNum - argCpx;
      Complex sub = new Complex();
      sub.setReal(realTmp);
      sub.setCpx(cpxTmp);
      return sub;
   }

// Judge if two complex numbers is the same : yes=>return true, no=>return false
   public boolean equals(String otherCpx){
      stringtoInt(otherCpx);
      if(realNum == argNum && cpxNum == argCpx) return true;
      else return false;
   }

// Print out the complex number   
   public String toString(){
      if(cpxNum == 0){
         System.out.println(realNum);
      }
      else if(cpxNum == 1){
         System.out.println(realNum+"+i");
      }
      else{
         if(cpxNum < 0){
            int cpxTmp = -cpxNum;
	    System.out.println(realNum+"-"+cpxTmp+"i");
	 }
	 else{
            System.out.println(realNum+"+"+cpxNum+"i");
	 }
      }
      return null;
   }


// private section------------------
   private int realNum, cpxNum;

   private int argNum, argCpx;

// Take out the numbers from equation   
   private void stringtoInt(String str){
      char c = '\0';
      int real=0, cpx=0;

      for(int cnt=0; cnt<str.length(); cnt++){
         if(str.charAt(cnt) == '+' || str.charAt(cnt) == '-'){
	 c = str.charAt(cnt);
	 break;
 	 }
      }

      if(c == '+'){
	 String[] s = str.split("\\+");
      // convert string to int
         for(int cnt=0; cnt<s[0].length(); cnt++){
            if(s[0].charAt(cnt) != ' '){
               real = real*10 + (s[0].charAt(cnt) - '0');
	    }
	 }
         for(int cnt=0; cnt<s[1].length(); cnt++){
            if(s[1].charAt(cnt) != ' '){
               cpx = cpx*10 + (s[1].charAt(cnt) - '0');
            }
         }
	 cpx = (cpx-57)/10;
      }
      else if(c == '-'){
         String[] s = str.split("\\-");
	 for(int cnt=0; cnt<s[0].length(); cnt++){
            if(s[0].charAt(cnt) != ' '){
               real = real*10 + (s[0].charAt(cnt) - '0');
 	    }
 	 }
	 for(int cnt=0; cnt<s[1].length(); cnt++){
            if(s[1].charAt(cnt) != ' '){
               cpx = cpx*10 + (s[1].charAt(cnt) - '0' );
	    }
	 }
	 cpx = -(cpx-57)/10;
      }

      argNum = real;
      argCpx = cpx;
   }// end method stringtoInt()


}// end of class Complex


public class Hw4_2{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int real=0, cpx=0;

      System.out.print("Please enter the real part    : ");
      real = input.nextInt();
      System.out.print("Please enter the complex part : ");
      cpx = input.nextInt();
      System.out.print("Please enter the other whole complex number : ");
      input.nextLine();
      String s = input.nextLine();
      System.out.println("> > > > > > ");

      Complex c = new Complex();
      Complex tmp = new Complex();
      c.setReal(real);
      c.setCpx(cpx);
      System.out.print("The first complex number is : ");
      c.toString();
      tmp = c.complexAddition(s);
      System.out.print("The addition of two complex number : ");
      tmp.toString(); 
      tmp = c.complexSubtraction(s);
      System.out.print("The substraction of two complex number : ");
      tmp.toString();
      System.out.print("Two complex number is same? : " + c.equals(s));
  
   }
}

