import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class euclidean {
	int mod_num;
	
	
	
	public void e_algorithm(int a , int b){
		
		while(b!=0){
			
			if(a>b){
				
				mod_num = a%b;
				a = b;
				b = mod_num;
				
			}
			
			if(b > a ){
				
				mod_num = a%b;
				a = a;
				b = mod_num;
				
			}
			
		System.out.print("GCD= (" + a);
		System.out.print(",");
		System.out.print(""+b);
		System.out.println(")");
		
		}
		
		
	}
	
//	while(b != 0){
//		
//		mod_num = a %b; 
//		
//	}




//public void print_output(){
//	
//	
//	
//}

public static void main(String args[]) throws IOException{
	int a,b;
	String input_a;
	String input_b;

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("enter two numbers to get Greatest Common Divisor(GCD) ");
	System.out.println("enter the first number:");

	input_a = br.readLine();
	a = Integer.parseInt(input_a);
	System.out.println(" the first number is :  " + a);
	
	System.out.println("enter the second number:");
	input_b = br.readLine();
	b = Integer.parseInt(input_b);
	System.out.println("the second number is: " + b);
	
	
	euclidean algorithm =  new euclidean();
	algorithm.e_algorithm(a,b);
	
//	algorithm.print_output;
	
	
	
}

}