package HelloWorld.Challenges;

public class EqualityPrinter {
    public static void main(String[] args) {
        printEqual(2, 12, 1);

    }

    public static void printEqual(int a, int b, int c) {
        if ((a < 0) || (b < 0) || (c < 0)) {
            System.out.println("Invalid Value");
        } else if ((a == b) && (b == c)) {
            System.out.println("All are equal");
        } else if ((a != b) && (b != c) && (c != a)) {
            System.out.println("All are unequal");
        } else {
            System.out.println(" Neither equal nor unequal");
        }
    }

}
