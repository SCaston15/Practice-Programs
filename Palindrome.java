import java.util.Scanner;
public class Palindrome{
	public static void main (String[]args){
		
		Scanner input = new Scanner(System.in); 
		
		String word = "mom mon"; 
		String word2 = "noctis"; 
		String word3 = "takakat"; 
		palindrome(word); 
	} 

static boolean palindrome(String str){
	
	int n = str.length(); 
	
	char[] tempArray = str.toCharArray(); 
	
	int left = 0; 
	int right = tempArray.length-1; 
	
	for(left = 0; left< right; left++, right--){
		char temp = tempArray[left];
	
		tempArray[left] = tempArray[right]; 
		tempArray[right]= temp; 
	}
	System.out.println(tempArray);
	
	for(int j = 0; j < n-1; j++){
		if(str.charAt(j) != tempArray[j]){
			System.out.println("Is not a palindrome");
			return false; 
		}
		}
			System.out.println("Is a palindrome");
			return true; 
	   
	}
}