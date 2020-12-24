package exception;

import javax.swing.plaf.ActionMapUIResource;

public class TestException {

	public static void main(String[] args) {
		try {
		int a =1;
		int b = a/1;
		int[] x = {}; //size =0
		System.out.println("done");
		}catch (ArithmeticException ex) {
			System.out.println("錯誤:除以0");
			ex.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("陣列操作錯誤");
			ex.printStackTrace();
		}
		
		
		finally {
			System.out.println("finally一定會被執行的區塊");
		}

	}

}
