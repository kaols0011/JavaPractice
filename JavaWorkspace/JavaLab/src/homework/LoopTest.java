package homework;

public class LoopTest {
    public static void main(String[] args) {
        //請列印出1－100中的所有質數，並加總質數的總和
        //提示：google : java 質數
    	int j=0,sum=0;
		for ( int i = 1; i < 100; i++) {
			for ( j = 2; j < i; j++) {
				if (i%j==0) {
					break;
					
				}
			}
			if (j>=i) {
				System.out.println(j);
				sum =sum+j;
				
			}
		}
		System.out.println("總和"+sum);
    }
}
