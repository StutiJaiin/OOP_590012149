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
            
            

            /* sum_array += args[i];: this will show an error as it excepts a string type 
            but it is actually an int, so we can convert it into an array type, but cannot change String[] to Integer[]*/


        }

        if (sum == sum_array) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");

        }

    }

}


