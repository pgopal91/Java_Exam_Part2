package Part1;

import java.util.Scanner;

/**
 * Created by pgopal on 3/3/2017.
 */
public class InputSumOrMultiply {

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner1 = new Scanner(System.in);
        int num = scanner1.nextInt();
        System.out.println("Enter 'add' or 'multiply': ");
        Scanner scanner2 = new Scanner(System.in);
        String str = scanner2.nextLine();
        if(str.toLowerCase().equals("add")){
            System.out.println("The sum is " + addition(num));
        }
        else if(str.toLowerCase().equals("multiply")){
            System.out.println("The product is " + multiply(num));
        }
        else{
            System.out.println("Invalid input");
        }
    }

    private static int addition(int num1){
        if (num1 >= 0)
        {
            int sum = 0;
            for (int i = 0; i <= num1; i++){
                sum += i;
            }
            return sum;
        } else {
            return -1;
        }
    }

    private static int multiply(int num){
        if (num > 0) {
            int sum = 1;
            for (int i = 1; i <= num; i++) {
                sum *= i;
            }
            return sum;
        }
        else if (num == 0) {
            return 0;
        }
        else
        {
            return -1;
        }
    }
}
