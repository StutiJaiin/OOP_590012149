public class Exp12 {
    public static void main(String[] args) {
        String s1 = "Jain";
        String s2 = "Jain";
        boolean same = true;

        if (s1.length() != s2.length()) {
            same = false;
            System.out.println("The strings are not the same");
        } else {
            for (int i = 0; i < (s1.length()); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    same = false;
                    break;
                }


            }
            if (same) {
                System.out.println("The string are same");
            }
            else {
                System.out.println("The strings are not the same");
            }

        }
    }

}
