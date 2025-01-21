import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
        ArrayList<Float> nums = new ArrayList<Float>();

        // Exercise #1
        System.out.print("----- Exercise 1 -----\nNumber 1: ");
        nums.add(getInput.nextFloat());
        System.out.print("Number 2: ");
        nums.add(getInput.nextFloat());
        System.out.print("Number 3: ");
        nums.add(getInput.nextFloat());
        System.out.printf("The largest number is: %.2f\nThe smallest number is: %.2f",Collections.max(nums),Collections.min(nums));

        // Exercise #2
        System.out.print("\n----- Exercise 2 -----\nNumber Input: ");
        int evenOrOdd = getInput.nextInt();
        if((evenOrOdd%2) == 0) {
            System.out.println("The Number is Even");
        } else {
            System.out.println("The Number is Odd");
        }

        // Exercise #3
        System.out.print("----- Exercise 3 -----\nNumber Input: ");
        int fibbonaciAmount = getInput.nextInt();
        int fibbonaciOne = 0; int fibbonaciTwo = 1; int fibbonaciAnswer = -1 ;
        if(fibbonaciAmount==1) {
            fibbonaciAnswer = 0;
        } else if(fibbonaciAmount==2) {
            fibbonaciAnswer = 1;
        } else {
            for (int i = 3; i <= fibbonaciAmount; i++) {
                fibbonaciAnswer = fibbonaciOne + fibbonaciTwo;
                fibbonaciOne = fibbonaciTwo;
                fibbonaciTwo = fibbonaciAnswer;
            }
        }
        System.out.printf("The %sth number in the Fibonacci Sequence is %d.",fibbonaciAmount,fibbonaciAnswer);

    }
}