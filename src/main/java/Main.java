import Lab1.MainTaskL1;
import Lab1.Task1L1.Task1L1;
import Lab1.Task2L1.Task2L1;
import Lab1.Task3L1.Task3L1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        while(true){
            System.out.print("Введите номер задания\n");

            int number = in.nextInt();
            MainTaskL1 T;
            switch (number) {
                case (1) -> {
                    T = new Task1L1();
                    T.startTask();

                }
                case (2) -> {
                    T = new Task2L1();
                    T.startTask();

                }
                case (3) -> {
                    T = new Task3L1();
                    T.startTask();

                }
                default -> {
                    return;
                }
            }
        }


    }


}