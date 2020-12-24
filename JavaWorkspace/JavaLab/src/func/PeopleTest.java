package func;

public class PeopleTest {

	public static void main(String[] args) {
		People p = new People();
		p.height=1.8;
		p.weight=70;
		double b =p.getBMI();
		System.out.println( "BMI="+b);
		
		double b2 =People.BMI(1.7, 70);
		System.out.println("Static bmi="+b2);

	}

}
