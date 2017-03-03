package Part1;

import java.util.Scanner;

/**
 * Created by pgopal on 3/3/2017.
 */
public class InputSum {

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num >= 0) {
          int sum = 0;
          for (int i = 0; i <= num; i++) {
            sum += i;
          }
          System.out.println("The sum is " + sum);
        } else {
            System.out.println("Invalid number");
        }
    }
}
