package array;

public class TestArray {

	public static void main(String[] args) {
		double sum=0,avg,max=0,min=0;
		

		double x[] = {1.1,2.0,1.2,1.4,0.5,6.0 };
		max=min=x[0];
		for ( int i=0 ; i < x.length; i++) {
			sum =sum+x[i];
			
		}
		for (int j = 0; j < x.length; j++) {
			if (x[j]>max) {
				max=x[j];
				
			}
			
			
		}
		
		avg=sum/x.length;
		System.out.println(max);
		System.out.println("sum="+sum);
		System.out.println("avg="+avg);
		
		
		
	}

}
