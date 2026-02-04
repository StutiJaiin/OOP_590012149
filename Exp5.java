import java.util.Scanner;

public class Exp5 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};                                                      //declaring an array and it's elements

        int arr1[] = new int[5];                                                    //declaring an array with a fixed size

        int sum_arr = 0;

        for(int i=0; i<4; i++){
            System.out.println(arr[i]);                                              //traversing and accessing the elements of an array

        }

        int length = arr.length;

        System.out.println("The length of the array is: " + length);                //finding the length of an array

        arr[2] = 5;                                                                 //changing an element in the array


        //finding the sum of the elements of an array
        for(int i =0; i<4; i++){
            sum_arr += arr[i];
        }


        System.out.println("The sum of the elements of the array is: " + sum_arr);


    }
}
