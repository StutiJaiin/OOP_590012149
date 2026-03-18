public class ObjArr {
    int x=0;
    int y=0;
}
class Main {
    public static void main(String[] args){

        ObjArr[] arr = new ObjArr[4];                                   //array declaration

        for(int i =0; i<arr.length; i++){
            arr[i] = new ObjArr();                                      //initializing object using loop
        }

        for(int i =0 ;i<arr.length; i++){
            arr[i].x = i*2;
            arr[i].y = i+2;
            System.out.println("x: " + arr[i].x + "; y: " + arr[i].y);

        }
    }
}
