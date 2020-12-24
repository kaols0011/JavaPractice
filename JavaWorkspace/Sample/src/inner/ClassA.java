package inner;

public class ClassA {

    private double height  = 0;
    private double weight  = 0;

    public ClassA(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public class InnerClass {
        public double calcBMI(){
            return weight / Math.pow(height,2);
        }
    }
    public void printBMI(){
        //利用inner class 改變counter的值,可以看見private成員
        InnerClass inner = new InnerClass();
        double bmi = inner.calcBMI();
        System.out.println(bmi);
    }
}
