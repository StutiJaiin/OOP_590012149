import java.util.Scanner;
public class Exp11 {
    static int x =0;
    int divide(){
        return 100/x;
    }
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the divisor: ");
        x = s.nextInt();

        try {                                                                       //trying to divide an integer by 100
            System.out.println(100/x);
        }
        catch (Exception e){                                                        //the exception that will give the wrong output is x=0
            System.out.println("Cannot be divided by 0");
        }
        finally {
            System.out.println("The program is complete");

        }
    }
}
