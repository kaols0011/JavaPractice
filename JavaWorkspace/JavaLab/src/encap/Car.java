package encap;

public class Car {
	private String model;
	private int price;
    private char color;
	
	public char getColor() {
		return color;
	}


	public void setColor(char color) {
		this.color = color;
	}


	public Car(char color,String model) {
		setModel(model);
		this.color =color;
		//this.model =model;
		
		
	}
	public Car() {
		this('R',"Prius");
	}
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
		if (model.equals("Yaris")) {
			this.price=5000000;
		}
		else if (model.equals("Prius")) {
			this.price =6000000;
		}
		else {
			this.price =0;
			System.out.println("erro");
		}
	}
	public int getPrice() {
		return price;
	}
	
	
	

}
