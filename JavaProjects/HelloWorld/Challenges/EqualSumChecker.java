package HelloWorld.Challenges;

public class EqualSumChecker {
    public static void main(String[] args) {
        boolean result = hasEqualSum(1, 2, 4);
        System.out.println(result);

    }

    public static boolean hasEqualSum(int a, int b, int c) {
        if ((a + b) == c) {
            return true;
        } else
            return false;

    }

}
