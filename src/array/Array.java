package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = s.nextInt();
        String[] myArray = new String[length];
        System.out.println("Enter the elements of the array:");
        int i = 0;
        while(true) {
            if(i == length) break;
            String input = s.next();
            if(input.length() > 7) {
                System.out.println("Maximum is 7");
            } else {
                myArray[i] = input;
                i++;
            }
        }

        System.out.println(Arrays.toString(myArray));
    }
}
