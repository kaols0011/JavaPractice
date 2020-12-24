package func;

public class People {
	double weight;
	double height;
	public double getBMI() {
		double bmi = weight / (height*height);
		return bmi;
	}
	public static double BMI(double height,double weight) {
		double bmi = weight / (height*height);
		return bmi;
		
	}

}
