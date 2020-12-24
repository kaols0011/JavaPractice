package interFace;

import java.awt.GradientPaint;
import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestProduct  {

	public static void main(String[] args) {
		/*
		Product p = new Product("USB",200);
		System.out.println("tax="+Product.TAX);
		String desc = p.desc();
		System.out.println(desc);
		*/
		Product p = new Notebook("Asus", 20000,365);
		Product p1 = new Notebook("Acer", 21000, 365);
		
		
		GregorianCalendar calendar = new GregorianCalendar(2020,6,31); //2020/8/31
		Date expDate = calendar.getTime();
		Food f1 = new Food("肉鬆", 200, expDate);
		
		SimCard sim = new SimCard("日本漫遊", 500, expDate); //2020/8/31 開卡 
		
		
		Product[] items = {p , p1 ,f1,sim};
		for (int i = 0; i < items.length; i++) {
			Product item = items[i];
			
			System.out.println(item.desc());
			if (item instanceof Expirable) {
				Expirable expItem = (Expirable)item;
				Date now = new Date();
				if (expItem.最後使用期限().before(now)) {
					System.out.println(item.getName()+"過期");
					
				}else {
					System.out.println(item.getName()+"未過期");
				}
				
				
			}
		}
		
		
		
		

	}

}
