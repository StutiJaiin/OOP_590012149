public class Dup {
    int i=0, j=0;
    int arr[] = {1, 2, 3, 4};
    int arr1[] = {1, 3, 7, 5};
    Boolean dup_found = false;

    public static void main(String[] args){

        Dup d = new Dup();
        
        for(d.i=0; d.i<4; d.i++){
            for (d.j=0; d.j<4; d.j++){
                if (d.arr[d.i]  == d.arr1[d.j]) {
                    d.dup_found = true;
                    System.out.println("The duplicate is found at the index: " + d.i + " in array 1; index " + d.j + " in array 2");
                    System.out.println("The duplicate number/s are: " + d.arr[d.i] + ", " + d.arr[d.j]);

                }
            }

        }

        if(d.dup_found == false) {
            System.out.println("No Duplicates");
        }

    }

}

