import java.util.Scanner;

class Hw1_3{

   public static String reCombine(String s){
      String capital;
      String subString;
      String newName;

      capital   = s.substring(0,1);        // �N���r���P��P��}
      subString = s.substring(1);
      newName   = subString + capital;     // ���s�զX��A�N���r�אּ�j�g
      capital   = newName.substring(0,1);
      subString = newName.substring(1);
      newName   = capital.toUpperCase() + subString + "ay";   // �̫ᤣ�Ѧr���[�Way

      return newName;
   }


   public static void main(String[] args){
      String first, firstTemp;
      String last,  lastTemp;
      String capitalTemp;

      Scanner input = new Scanner(System.in);   // declare a obj. to use system input
      System.out.printf("Please enter the first name : ");
      first = input.next();
      first = reCombine(first);
      System.out.printf("Please enter the last  name : ");
      last  = input.next();
      last  = reCombine(last);

      System.out.println("> > > > >");
      System.out.println("Name after processing is : " + first + " " + last);

   }

}

