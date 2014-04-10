/**
 * Cross platform programming HW1.
 * Inplement the following 11 method and show on the screen.
 */

import java.util.StringTokenizer;
import java.util.Arrays;

public class HW1{

// constructor overloading
   public HW1(){
      elements = new int[0];
      eleSize = 0;
      classString = null;
   }

   public HW1(String input){
   // ignore the ',' of the input string and initialize variables
      StringTokenizer st = new StringTokenizer(input, ",");
      elements = new int[st.countTokens()];
      eleSize = st.countTokens();
   // turn string to int and store in elements[]
      int cnt=0;
      while(st.hasMoreTokens()){
   	 String token = st.nextToken();
	 int eleTmp=0;
         for(int cnt1=0; cnt1<token.length(); cnt1++){
            eleTmp = eleTmp*10 + (token.charAt(cnt1) - '0'); 
	 }
         elements[cnt] = eleTmp;
         cnt++;
      }
      classString = input;
   }


// return the number of element store in elements   
   public int size(){
      return eleSize;
   }


// return true  if elements don't have any element
//        false if elements have at least one element
   public boolean isEmpty(){
      if(eleSize == 0) return true;
      else return false;
   }


// retrun true  if all elements in elements are prime number
//        false if not
   public boolean isPnumber(){
      if(eleSize == 0){
         return false;
      }

      for(int cnt=0; cnt<eleSize; cnt++){
         if(!isPrime(elements[cnt]))   return false;
      }
      return true;
   }  


// return true  if all elements in elsments are even number
//        false if not
   public boolean isEvennumber(){
      if(eleSize == 0){
         return false;
      }

      for(int cnt=0; cnt<eleSize; cnt++){
         if(elements[cnt]%2 != 0)   return false;
      }
      return true;
   }


// return the maximum number in elements
   public int getMaximalElement(){
      if(eleSize==0){
         return 0;
      }

      int[] eleTmp = new int[eleSize];
      for(int cnt=0; cnt<eleSize; cnt++){
         eleTmp[cnt] = elements[cnt];
      }
      Arrays.sort(eleTmp);
      return eleTmp[eleSize-1];  
   }


// reverse the elements and output
   public void reverse(){
      if(eleSize == 0){
	 System.out.println();     
	 return;
      }

      for(int cnt=eleSize-1; cnt>=0; cnt--){
         System.out.print(elements[cnt]);
	 if(cnt!=0) System.out.print(",");
      }
      System.out.println();
   }


// print the distinct elements in elements
   public void showDistinctElements(){
      int flag = 0;   // record if having the same number or not
      for(int cnt=0; cnt<eleSize; cnt++){
         if(cnt>0){
            for(int cnt1=0; cnt1<cnt; cnt1++){
               if(elements[cnt] == elements[cnt1])   flag = 1;
	    }
	 }
 
         if(flag == 0){
            if(cnt>0)   System.out.print(",");
            System.out.print(elements[cnt]);
	 }
   	 else{
	    flag = 0;
            continue;
	 }

      }
      System.out.println();
   }


// return true  if numberSet = numberSet s
//        false if not
   public boolean equals(HW1 s){
      int[] eleTmp = new int[eleSize];	   
      for(int cnt=0; cnt<eleSize; cnt++){
         eleTmp[cnt] = elements[cnt];
      }
      Arrays.sort(eleTmp);
      Arrays.sort(s.elements);
      return Arrays.equals(eleTmp, s.elements);
   }


// return true  if the numberSet is the subset of s
//        false if not
   public boolean subSet(HW1 s){
      int flag=0;
      for(int cnt=0; cnt<eleSize; cnt++){
         for(int cnt1=0; cnt1<s.eleSize; cnt1++){
            if(elements[cnt] == s.elements[cnt1]){
                flag++;
		break;
	    }
	 }
      }
      if(flag == (eleSize)){
         return true;      
      }else{
         return false;
      }
   }


// return two sets union : 會有聯集數字重複問題，暫用showDistinctElement()印出不重複集合
   public HW1 union(HW1 s){
      HW1 obj = 
		new HW1(classString+","+s.classString);
      return obj;
   }


// return two sets intersection : 會有交集數字重複問題，暫用showDistinctElement()印出不重複集合
   public HW1 intersection(HW1 s){
      String inse = "";
      int size, elecnt=0;
      size = (eleSize>s.eleSize)? s.eleSize : eleSize;
      int[] inseTmp = new int[size];
      for(int cnt=0; cnt<eleSize; cnt++){
         for(int cnt1=0; cnt1<s.eleSize; cnt1++){
            if(elements[cnt]==s.elements[cnt1]){ 
	       inseTmp[elecnt] = elements[cnt];
	       elecnt++;
	       break;
	    }
	 }
      }
      for(int cnt=0; cnt<elecnt; cnt++){
	 if(cnt>0)   inse = inse + ",";    
         inse = inse + (inseTmp[cnt]);
      }
      HW1 obj = new HW1(inse);
      return obj;
   }


// private section --------------------------------------
   private int[] elements;

   private int eleSize;

   private String classString;
// method check if prime number or not
   private boolean isPrime(int num){
      if(num>2 && num%2 == 0)   return false;
      for(int cnt=3; cnt*cnt<=num; cnt+=2){
         if(num%cnt == 0)   return false;
      }
      return true;
   }



// main function ----------------------------------------
   public static void main(String[] args){

      HW1 numSet1 = new HW1(args[0]);
      HW1 numSet2 = new HW1(args[1]);
 
      System.out.println("Length of Set 1           : " + numSet1.size());
      System.out.println("If Set 1 is empty set     : " + numSet1.isEmpty());
      System.out.println("Every number is prime     : " + numSet1.isPnumber());
      System.out.println("Every number is even      : " + numSet1.isEvennumber());
      System.out.println("Max number of set 1       : " + numSet1.getMaximalElement());
      System.out.print  ("Reverse output of set 1   : ");
      numSet1.reverse();
      System.out.print  ("Distinct numbers of set 1 : ");
      numSet1.showDistinctElements();
      System.out.println("If set 1 same as set 2    : " + numSet1.equals(numSet2));
      System.out.println("If set 1 is subset of 2   : " + numSet1.subSet(numSet2));
      System.out.print  ("Union elements of two set : ");
      numSet1.union(numSet2).showDistinctElements();
      System.out.print  ("Intersection of two set   : ");
      numSet1.intersection(numSet2).showDistinctElements();

   }

}

