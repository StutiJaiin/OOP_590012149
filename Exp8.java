public class Exp8 {                                                          //class creation
    int a;
    int b;
    int c;

    Exp8(){                                                          //constructor creation
        a =0;
        b =0;
        c =0;

    }

    Exp8(int age, int marks){                                        //constructor overloading
        age =9;
        marks = 10;
    }

    void sum(int a, int b){
        System.out.println("The sum of a and b is: " + (a+b));
    }

    void sum (int a, int b, int c){
        System.out.println("The sum of a, b, and c is: " + (a+b+c));      //method overloading (same method, different parameters)

    }

    public static void main(String[] args){
        //calling the constructors:

        Exp8 obj = new Exp8();
        obj.sum(17, 18);

        Exp8 obj1 = new Exp8();
        obj1.sum(14, 17, 10);

    }




}
