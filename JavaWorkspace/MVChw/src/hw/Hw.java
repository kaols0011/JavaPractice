package hw;

import java.math.*;
import java.util.Scanner;


public class Hw {

	public static void main(String[] args) {

	        
	      BigInteger bi1, bi2, bi3,bi4,bi5;
	      Scanner s=new Scanner(System.in);
          System.out.println("第一個數:");
          bi1 = s.nextBigInteger();
          System.out.println("第二個數:");
          bi2 = s.nextBigInteger();

	      // assign gcd of bi1, bi2 to bi3
	      bi3 = bi1.gcd(bi2);
	      System.out.println(bi3);
	      bi4=bi1.multiply(bi2);
	      bi5=bi4.divide(bi3);

	      String str = "GCD of " + bi1 + " and " + bi2 + " is " +bi3;
	      String str1 ="LCM of "  + bi1 + " and " + bi2 + " is " +bi5;

	      // print bi3 value
	      System.out.println( str );
	      System.out.println( str1 );
	   }
	    
	} 