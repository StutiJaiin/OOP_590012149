import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args){
        int sum = 0;
        int sum_array = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of the sum: ");
        sum = s.nextInt();


        int arr[] = new int[5];
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the elements of the array: ");
        for (int i=0; i<5; i++){
            arr[i] = s1.nextInt();

            sum_array += arr[i];


        }

        if (sum == sum_array) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");

        }

    }

}
