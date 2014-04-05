/**
 * Simple cryptarithmetic puzzles : TOO+TOO+TOO+TOO=GOOD,
 * find the answer set of this equation and print out.
 */

class Hw3_5{

   public static void main(String[] args){
      int t, o, g, d;
      int setNum = 1;
      for(t=0; t<10; t++){
         for(o=0; o<10; o++){
            if(o == t) continue;
	    else{
	       for(g=0; g<10; g++){
		  if(g == t || g == o) continue;
		  else{
	             for(d=0; d<10; d++){
			if(d == t || d == o || d == g) continue;
			else{
                           if(1000*g-400*t+66*o+d == 0){
			      System.out.println("Answer set "+setNum+" :");
		              System.out.println("T : "+t);
		              System.out.println("G : "+g);
		              System.out.println("O : "+o);
		              System.out.println("D : "+d);
		              System.out.println("==============");
		              setNum++;	      
			   }
			}
		     }//end for:d
		  }
	       }//end for:g
	    }
	 }//end for:o		 
      }//end for:t
       
   }//end main

}//end class

