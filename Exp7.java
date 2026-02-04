public class Exp7 {                                                     //class creation
    String name;
    int age;
    int marks;

    Exp7(String name, int age, int marks){                              //creating a constructor
        this.name = "Stuti";
        this.age = 19;
        this.marks = 99;
    }

    void Student_Details() {
        System.out.println("The student name is : " + name);
        System.out.println("The student age is: " + age);
        System.out.println("Marks obtained by the student are : " + marks);

    }


    public static void main(String[] args) {
        Exp7 obj = new Exp7("Stuti", 19,99);

        obj.Student_Details();


    }
}