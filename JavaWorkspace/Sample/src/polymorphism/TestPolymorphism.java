package polymorphism;


import java.util.GregorianCalendar;

import extend.Food;

public class TestPolymorphism {

    public static void main(String[] args) {


        /* step1 轉型成父類別*/
        Notebook notebook = new Notebook("Asus Notebook", 50000,365);

        Product item = notebook;
        System.out.println(item.desc());

        //step2 用同一個『方法』操作不同型態的物件
        Product item1,item2;
        item1 = new Notebook("Asus Notebook", 50000,365);
        
        GregorianCalendar calendar = new GregorianCalendar(2019,2,10);
        item2 = new Food("肉鬆",100,calendar.getTime());
        Product[] items = new Product[]{item1,item2};
        //Step2.1 如果再有新的類別產生ProductYYY，以下迴圈也無需修改
        for (Product eachItem : items) {
            System.out.println(eachItem.desc());
        }


        //step3 instanceof
        System.out.println(item1 instanceof Notebook);
        System.out.println(item2 instanceof Food);
        System.out.println(item1 instanceof Food);


    }

    public void 訴訟(){
        
    }

}
