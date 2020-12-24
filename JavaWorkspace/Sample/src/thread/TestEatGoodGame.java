package thread;

import java.util.Scanner;

public class TestEatGoodGame {
    public static void main(String[] args) {
        int numberOfThreads = 10;
        FoodMonsterWhileLoop[] games = new FoodMonsterWhileLoop[numberOfThreads];
        //FoodMonsterGameWait[] games = new FoodMonsterGameWait[items];
        for( int i=0 ; i < numberOfThreads ; i++) {
            games[i] = new FoodMonsterWhileLoop();
//            games[i] = new FoodMonsterGameWait();
            games[i].setName("貪食怪["+i+"]");
            games[i].start();
        }

        
        Scanner scanner = new Scanner(System.in);
        System.out.println("輸入F餵食,輸入Q結束");
        String command = scanner.nextLine();
        while ( command.equalsIgnoreCase("F")){
            System.out.println("餵食");
            for( int i=0 ; i < numberOfThreads ; i++) {
                games[i].feed();
            }
            System.out.println("輸入F餵食,輸入Q結束");
            command = scanner.nextLine();
            if ( command.equalsIgnoreCase("Q")){
                break;
            }
        }

        System.out.println("End");
        System.exit(0);
    }
}
