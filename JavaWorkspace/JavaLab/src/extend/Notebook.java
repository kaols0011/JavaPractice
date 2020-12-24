package extend;

import interFace.Warrantable;

public class Notebook extends Product implements Warrantable{
	@Override
	public void calc(int price) {	
	}
	
	public int warranty;

		
	
 public Notebook( String name, int price,int warranty) {
			this.warranty = warranty;
			this.name = name;
			this.price = price;
		}  


@Override
public String desc() {
	String fromSuperDesc = super.desc();
	String d = fromSuperDesc +"保固,"+ this.warranty+"天";
	//String d = this.name+", Price = NT$"+ this.price +"保固,"+ this.warranty+"天";
	return d;
}


@Override
public int 保固天數() {
	// TODO Auto-generated method stub
	return this.warranty;
}

}
