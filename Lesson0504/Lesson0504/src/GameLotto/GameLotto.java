package GameLotto;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GameLotto {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] payerArr = new int[3];
        int[] compArr = new int[3];
        System.out.println("Hi! We will play in lotto. You should guess three numbers");
        System.out.println("Enter first number");
        payerArr[0] = scanner.nextInt();
        System.out.println("Enter second number");
        payerArr[1] = scanner.nextInt();
        System.out.println("Enter third number");
        payerArr[1] = scanner.nextInt();
        System.out.println("You enter numbers - " + Arrays.toString(payerArr));

        Thread.sleep(3000);
        System.out.println("Dram of lotto is spinning");
        compArr[0] = random.nextInt(10);
        System.out.println("It fell out with number - " + compArr[0]);
        if (payerArr[0] == compArr[0]) {
            System.out.println("Fist numbers are same");
        } else {
            System.out.println("Fist numbers are different ");
        }
        Thread.sleep(3000);
        System.out.println("Dram of lotto is spinning");
        compArr[1] = random.nextInt(10);
        System.out.println("It fell out with number - " + compArr[1]);
        if (payerArr[1] == compArr[1]) {
            System.out.println("Second numbers are same");
        } else {
            System.out.println("Second numbers are different ");
        }
        Thread.sleep(3000);
        System.out.println("Dram of lotto is spinning");
        compArr[2] = random.nextInt(10);
        System.out.println("It fell out with number - " + compArr[2]);
        if (payerArr[2] == compArr[2]) {
            System.out.println("Fist numbers are same");
        } else {
            System.out.println("Fist numbers are different ");
        }
        Thread.sleep(3000);
        System.out.println("You enter numbers - " + Arrays.toString(payerArr) +
                " number fell out from dram " + Arrays.toString(compArr));
        boolean win = payerArr.equals(compArr);
        if(win == true) {
            Thread.sleep(3000);
            System.out.println("You WIN!!!");
        } else {
            Thread.sleep(3000);
            System.out.println("You should try again.");
        }

    }
}
