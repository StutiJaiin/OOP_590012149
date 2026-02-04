public class Exp9 {
    int x = 9;
    int y = 10;

    void sum(int x, int y) {
        System.out.println("The sum is : " + (x + y));

    }
}

class Child extends Exp9 {                                                              //inheritance


    void sum(int x, int y){
        System.out.println("The product is: " + (x*y));                                     //method overriding
    }

    public static void main(String[] args) {
        Child obj = new Child();


        obj.sum(9, 10);

    }

}
