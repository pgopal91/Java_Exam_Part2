package Part1;

import java.util.Scanner;

/**
 * Created by pgopal on 3/3/2017.
 */
public class InputIntroduction {

    public static void main(String[] args){
        System.out.println("Enter your username: ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        System.out.println("Hi, " + username + ". How are you?");
    }
}
