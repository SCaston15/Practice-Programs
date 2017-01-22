public class FizzBuzz{
	public static void main(String[] args){
	
		for(int i = 1; i <= 100; i++){
			boolean print = true; 
			
			if(i % 3 == 0 && i % 15 != 0){
				System.out.println("Fizz");
				print = false; 
			}
			if(i % 5 == 0 && i % 15 != 0){
				System.out.println("Buzz");
				print = false; 
			}
			
			if(i % 15 == 0){
				System.out.println("FizzBuzz"); 
				print = false; 
				}
			
			if(print == true){
				System.out.println(i);
			}
		}
} 
} 