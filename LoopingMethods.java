package Part2;

import java.util.Scanner;

/**
 * Created by pgopal on 3/3/2017.
 */
public class LoopingMethods {
    private static int[] list = new int[]{13, 10, 7};

    public static void main(String[] args){
        System.out.println("Enter a method (for, while, recursion): ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if(str.toLowerCase().equals("for")){
            System.out.println("The for loop addition answer is " + forLoop(list));
        }
        else if(str.toLowerCase().equals("while")){
            System.out.println("The while loop addition answer is " + whileLoop(list));
        }
        else if(str.toLowerCase().equals("recursion")){
            System.out.println("The recursion addition answer is " + recursion(list, list.length-1));
        }
        else{
            System.out.println("Invalid option");
        }
    }

    private static int forLoop(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }

    private static int whileLoop(int[] array){
        int sum =0;
        int i = 0;
        while(array.length > i){
            sum += array[i];
            i++;
        }
        return sum;
    }

    private static int recursion(int[] array, int n){
        if (n == 0)
            return array[n];
        else
            return array[n] + recursion(array, n-1);
    }
}
