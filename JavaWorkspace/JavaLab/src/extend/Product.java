package extend;

public abstract class Product {
	
     String name;
     int price;
     
     //public static final double TAX = 0.05;
     //static {
    	 
     //}
    
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
		
	}
	public Product() {
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public String desc() {
		return this.name+", Price = NT$"+ this.price ;
		
	}
	public abstract void calc(int price);

	

}
