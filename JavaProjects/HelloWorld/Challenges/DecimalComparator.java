package HelloWorld.Challenges;

public class DecimalComparator {
    public static void main(String[] args) {
        boolean result = areEqualByThreeDecimalPlaces(3.175, 3.1756);
        System.out.println(result);

    }

    public static boolean areEqualByThreeDecimalPlaces(double d1, double d2) {
        int convertedDouble1 = (int) (d1 * 1000);
        int convertedDouble2 = (int) (d2 * 1000);
        if (convertedDouble1 == convertedDouble2) {
            // System.out.println(convertedDouble1 + " " + convertedDouble2);
            return true;
        } else

            return false;
    }

}
