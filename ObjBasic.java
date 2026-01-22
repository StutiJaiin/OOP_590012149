import java.util.Scanner;

public class car {                                                          //new class
    int model_year;
    int mileage;

    public static void main(String[] args){
        car c1 = new car();                                             //new object
        car c2 = new car();                                             //new object

        Scanner s = new Scanner(System.in);                             //new obj=scanner

        c1.mileage = s.nextInt();                                       //obj.int

        c2.model_year = s.nextInt();

        System.out.println(c1.mileage);

        System.out.println(c2.model_year);

        s.close();


    }
}
