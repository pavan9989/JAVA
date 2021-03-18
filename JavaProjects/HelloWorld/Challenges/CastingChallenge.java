package HelloWorld;

public class CastingChallenge {
    public static void main(String[] args) {
        byte newByte = 50;
        short newShort = 10;
        int newInt = 20;
        long newLong = (long) (5000 + (10 * (newByte + newShort + newInt)));
        System.out.println(newLong);

    }
}