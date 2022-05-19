import java.util.ArrayList;
import java.util.Scanner;
public class FizzBuzz{

	public static void main(String args[]){

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		ArrayList<String> strs = new ArrayList<String>();
		for(int i = 1; i <= n ; i++){

			if(i%3 == 0 && i%5 == 0){
	
				strs.add("FizzBuzz");
	
	
			}
			else if(i%3 == 0 ){
				strs.add("Fizz");
			}
			else if(i%5 == 0){
				strs.add("Buzz");
			}
			else{
				strs.add( i+"");
			}
	
		}
		
			for(String s:strs){
				System.out.println(s);
			}


		
		
	}

}
