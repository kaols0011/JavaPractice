package thread;

public class FoodMonsterWhileLoop extends Thread{

    private volatile boolean hasFood = false;
    public void eat(){
        //檢查是否有食物，沒有食物則利用while迴圈一直等候
        while (!hasFood) {
            //利用這種方式會一直執行，浪費cpu cycle
            //System.out.println(Thread.currentThread().getName()+":沒有食物，等待中");
        }
        System.out.println(Thread.currentThread().getName()+":吃完了");
        hasFood = false;//沒有食物了
        

    }

    public void feed(){
        hasFood =true;
        System.out.println("通知"+this.getName()+" 有食物了");
    }

    @Override
    public void run() {
        while ( true ) {
            eat();
        }
    }
    

}
