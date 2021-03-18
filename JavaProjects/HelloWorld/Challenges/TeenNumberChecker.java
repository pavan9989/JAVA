package HelloWorld.Challenges;

public class TeenNumberChecker {
    public static void main(String[] args) {
        boolean result = hasTeen(1, 5, 4);
        System.out.println(result);
        result = isTeen(19);
        System.out.println(result);

    }

    public static boolean hasTeen(int a, int b, int c) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19)) {
            return true;
        } else
            return false;

    }

    public static boolean isTeen(int a) {
        if ((a >= 13 && a <= 19)) {
            return true;
        } else
            return false;

    }

}
