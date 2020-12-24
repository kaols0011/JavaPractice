package reference;

/**
 * Created by vincent on 2017/7/10.
 */
public class PassObjectTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "David";
        employee.age = 20;
        System.out.println("更新前年紀為 = "+employee.age);
        update(employee);
        System.out.println("更新後年紀為 = "+employee.age);
    }

    public static void update(Employee emp){
        emp.age = 18;
    }
}
