package str.PolishReverse;
import java.util.Scanner;

public class RUNpolishNotation {
			public static void main(String[] args) {
				
			System.out.println("Please enter the polish reverse expression");
			Scanner scan = new Scanner(System.in);
			String inputdata = scan.nextLine();
			scan.close();
	   
	    	try{CheckStringException.check(inputdata);}
	    	catch(Exception m){
	    		System.out.println("Exception occured: "+m);
	    		return;} 
	    	
	    	System.out.println(ReversePolishReverse.reverse(inputdata));}
}