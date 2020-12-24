package extend;

import java.awt.GradientPaint;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestProduct {

	public static void main(String[] args) {
		/*
		Product p = new Product("USB",200);
		System.out.println("tax="+Product.TAX);
		String desc = p.desc();
		System.out.println(desc);
		*/
		Product p = new Notebook("Asus", 20000,365);
		Product p1 = new Notebook("Acer", 21000, 365);
		
		
		GregorianCalendar calendar = new GregorianCalendar(2020,7,31); //2020/8/31
		Date expDate = calendar.getTime();
		Food f1 = new Food("肉鬆", 200, expDate);
		
		
		Product[] items = {p , p1 ,f1};
		for (int i = 0; i < items.length; i++) {
			Product item = items[i];
			
			System.out.println(item.desc());
		}
		//System.out.println(p.desc());
		
		

	}

}
