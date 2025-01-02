// Implementing the linear search technique to 
// search a character in string...

public class SearchStrings {

    public static boolean searchChar(String str, char targetChar) {

        // if str is empty...
        if (str.length() == 0) {
            return false;
        }

        // searching character in string..
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == targetChar) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "Raj Bhushan Dixit";

        char targetChar = 'R';

        boolean output = searchChar(str, targetChar);

        if (output) {
            System.out.println("Character found in String");
        } else {
            System.out.println("Character not found in String!");
        }
    }
}
