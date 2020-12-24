import java.text.DecimalFormat;
import java.text.NumberFormat;

public class TestStringFormat {
    public static void main(String[] args) {
        String message = String.format("%15s=%10.0f", "bollinger", 10.00);
        double value = 1234.56;
        NumberFormat numberFormat = new DecimalFormat("#,###.##");
        System.out.println(numberFormat.format(value));
        System.out.println(String.format("%,.2f",1234.4567));
        System.out.println(String.format("%,d",1234));

    }
}
