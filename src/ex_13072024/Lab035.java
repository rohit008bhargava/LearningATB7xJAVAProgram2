package ex_13072024;

public class Lab035 {
    public static void main(String[] args) {
        // Escape chars
        char c = '\n'; // New line / Next Line
        char c1 = '\t'; // Add Tab
        char c2 = '\b'; // Backslash, delete 1 char
        char c3 = '\r'; // Backslash, delete 1 word
        System.out.println("Rohit" + c3 + "Bhargava");
        System.out.println("Rohit" + c2 + "Bhargava");
        System.out.println("Rohit" + c1 + "Bhargava");
        System.out.println("Rohit" + c + "Bhargava");
    }
}
