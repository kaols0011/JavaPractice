package func;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class FuncTest {

	public static void main(String[] args) {
		int c = add(5, 8);
		System.out.println(c);

	}
	
	public static int add( int a,int b) {
		int sum =a+b;
		return sum;
	}
	
	

}
