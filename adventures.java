import java.util.Scanner;

public class adventures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		   int black = 5;
		   int pink = 10;
		   int blue = 15;
		   String name = "";
		   Scanner ecn = new Scanner(System.in);
		   
		  System.out.println("enter your name");
		  name = ecn.next();
		  
		  System.out.println("what's your favorite color");
		  ecn.next();
		   
		   
		   System.out.println("enter your first number");
		  black = ecn.nextInt();
		   System.out.println("enter your second number");
		  pink = ecn.nextInt();
		   
		  System.out.println("the sum is");
		  blue = black + pink;
		  System.out.println(blue);
		  
		  System.out.println("the difference is");
				  blue = black - pink;
				  System.out.println(blue);
				  
				  System.out.println("the product is");
				  blue = black * pink;
				  System.out.println(blue);
				  
				  System.out.println("the quotient is");
				  blue = black / pink;
				  System.out.println(blue);
				  
				  System.out.println("thank you for your participation " + name);
				  
		   
		   
		   
		   
		 
				   
				   
	}

}
