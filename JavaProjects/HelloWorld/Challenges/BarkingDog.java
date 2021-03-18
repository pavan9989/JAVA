package HelloWorld.Challenges;

public class BarkingDog {
    public static void main(String[] args) {
        boolean myBoolean = shouldWakeUp(true, 24);
        System.out.println(myBoolean);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 && hourOfDay > 23) {
            return false;
        } else if (hourOfDay == 23 && barking == true) {
            return true;
        } else if (hourOfDay >= 0 && hourOfDay < 8 && barking == true) {
            return true;
        } else {
            return false;
        }

    }
}
