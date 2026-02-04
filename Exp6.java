import java.util.Scanner;
public class Exp6 {
        public static void main(String[] args) {

            Scanner s = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String str = s.nextLine();

            System.out.println("Length of string: " + str.length());                        //Finding the Length of string

            System.out.println("Uppercase: " + str.toUpperCase());                          //Converting a string to uppercase

            System.out.println("Lowercase: " + str.toLowerCase());                          //Converting a string to lowercase

            System.out.println("Character at index 0: " + str.charAt(0));                   //To find the character at a particular index

            String st = "Java Programming";

            System.out.println("Contains 'java': " + st.contains("java"));                 //to check if string contains a word

            System.out.println("Trimmed string: " + st.trim());                            //trimming spaces

            System.out.println(str.equals(st));                                             //comparing two strings

            // Concatenation
            System.out.println("Concatenated string: " + st.concat(" is nice"));      //adding one string to the end of the other

            s.close();
        }
    }

