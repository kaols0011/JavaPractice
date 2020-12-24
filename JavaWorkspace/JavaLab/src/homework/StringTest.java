package homework;

public class StringTest {
    public static void main(String[] args) {
        //1.
        String csv = "123,456,789,333";
        //以上數字為用,區隔，請加總所有的值, 利用Integer.valueOf方法可以將文字轉成數字
        int a = Integer.parseInt("123");
        int b = Integer.parseInt("456");
        int c = Integer.parseInt("789");
        int d = Integer.parseInt("333");
        System.out.println(a+b+c+d);
        
        

        //2. 產生1,2,3,4,5,.....99的文字，請利用StringBuilder類別以及迴圈實作
        /*範例
        StringBuilder builder = new StringBuilder("a");
        builder.append("1");
        System.out.println(builder); //會印出a1
        */
       
       for (int i = 0; i < 100; i++) {
    	   StringBuilder builder = new StringBuilder(i);
    	   System.out.println(builder);
	}


    }
}
