abstract class Exp10 {                                                 //making an abstract class
    abstract void RedLight();
    abstract void GreenLight();
    abstract void YellowLight();

}
    class Traffic extends Exp10{                                       //making a child class
    void RedLight(){
        System.out.println("Stop");
    }

    void GreenLight(){
        System.out.println("Go");
    }

    void YellowLight(){
        System.out.println("Wait");
    }

    public static void main(String[] args){

        Traffic obj = new Traffic();

        obj.RedLight();                                                 //calling the methods and keeping the method abstract
        obj.YellowLight();
        obj.GreenLight();

    }
}
