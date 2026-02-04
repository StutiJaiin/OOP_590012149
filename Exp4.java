//program to check if the numbers of the input are odd or even

import java.util.Scanner;

public class Exp4 {
    public static void main(String[] args) {

        int n;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        n = s.nextInt();

        System.out.println("Enter the elements of the array: ");
        int arr[] = new int[n];
        for(int i =0 ;i<n; i++) {
            arr[i] = s.nextInt();
        }

        for (int i = 0; i<n; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("The number " + arr[i] + " is even.");
            } else if (arr[i] % 2 != 0) {
                System.out.println("The number " + arr[i] + " is odd.");
            }
        }
    }
}





