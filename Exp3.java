public class Exp3 {
    public static void main(String[] args){
        byte b = 10;                                                    //stores very small values (smaller than short)
        short s =11;                                                    //stores very small values
        int i = 0;                                                      //stores integer values
        long l = 1000000L;                                              //stores large values
        float f = 10.77f;                                               //stores decimal numbers (upto 7 decimal points)
        double d = 22.122;                                              //stores decimal numbers with more precision
        char c = 'A';                                                   //stores characters
        boolean flag = true;                                            //stores value in true or false

        System.out.println(b+s);                                        //arithmetic operator (addition)
        System.out.println(s-b);                                        //arithmetic operator (subtraction)
        System.out.println(d/f);                                        //arithmetic operator (division)
        System.out.println(d*f);                                        //arithmetic operator (multiplication)
        System.out.println(s%b);                                        //arithmetic operator (modulus(gives the remainder))
        System.out.println(d==f);                                       //relational operator (equal to)
        System.out.println(d!=f);                                       //relational operator (not equal to)
        System.out.println(d>=f);                                       //relational operator (greater than equal to)
        System.out.println(d<=f);                                       //relational operator (lesser than equal to)
        System.out.println(d>f);                                       //relational operator  (greater than)
        System.out.println(d<f);                                       //relational operator  (lesser than)

        System.out.println((s++));                                      //increment operator
        System.out.println(b--);                                        //decrement operator


        b=9;                                                             //assignment operator











    }
}
