package Part2;

import java.util.Scanner;

/**
 * Created by pgopal on 3/3/2017.
 */
public class RotateArray {

    private static int[] arr = new int[] {1,2,3,4,5,6,7,8};

    public static void main(String[] args){
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        System.out.println("Enter a number : ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] result = rotate(arr, num);
        for(int i=0; i < result.length; i++){
            System.out.print(result[i]);
        }
    }

    private static int[] rotate(int[] a, int num){
        int length = a.length;
        int[] temp = new int[num];

        for(int i = 0; i < num; i++){
            temp[i] = a[i];
        }

        for(int i = 0; i < length-num; i++){
            a[i] = a[num + i];

        }

        int i =length-num;
        int j = 0;
        while(i < length && j < temp.length){
            a[i] = temp[j];
            i++;
            j++;
        }
        return a;
    }
}
