import java.util.Scanner;

public class inh {
    static int n = 0;
    static int x = 0;

    static String f = "string";


    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of x");
        x = s.nextInt();

        System.out.println("Enter the value of n");
        n = s.nextInt();

        System.out.println("The string is : " + f);

        System.out.println("The value of n: " + n);
        System.out.println("The value of x: " + x);
    }

}
