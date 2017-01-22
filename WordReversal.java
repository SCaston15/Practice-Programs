import java.util.Scanner;

public class WordReversal {

   public static void main(String[] args) {
      
	   String str  = "Stop doing that please"; 
	   reverseByWord(str); 
   }

   public static String reverse(String str) {
       
	   int n = str.length(); 
	   char[]tempA = str.toCharArray(); 
	   int left = 0; 
	   int right = n - 1; 
	   
	   for(left = 0; left<right; left++, right--){
		   
		   char temp = tempA[left]; 
		   tempA[left] = tempA[right];
		   tempA[right] = temp; 
		   
	   }
	   String string = String.valueOf(tempA);
	   return string; 
   }
	   
   public static String reverseByWord (String sentence){
       // First reverses the complete string
       // "I am going there" becomes "ereht gniog ma I"
       // After that we just need to reverse each word.
       String revSentence = reverse(sentence);
       String word_reversal = "";
       int last_space = - 1;
       int j = 0;
       
       while (j<sentence.length()){
           if (revSentence.charAt(j)==' '){
        	   // .substring(0 - 8)
               word_reversal = word_reversal + reverse(revSentence.substring(last_space+1, j));
               System.out.println(j);
               System.out.println(word_reversal);
               word_reversal = word_reversal + " ";
               last_space=j;
           }
           j++;
       }
       word_reversal = word_reversal + reverse(revSentence.substring(last_space+1, sentence.length()));
       System.out.println(word_reversal);
       return word_reversal;
   }      
}
