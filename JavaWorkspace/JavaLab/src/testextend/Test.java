package testextend;

public class Test {

	public static void main(String[] args) {
		Employee employee1 = new Employee(1,"kao",10);
		Manger manger1 =new Manger(100, "Gio", 20, 50);
		
		
		System.out.println(employee1.desc());
		System.out.println(manger1.desc());

	}

}
