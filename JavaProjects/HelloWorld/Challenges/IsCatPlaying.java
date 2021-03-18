package HelloWorld.Challenges;

public class IsCatPlaying {
    public static void main(String[] args) {
        boolean catPlaying = isCatPlaying(true, 45);
        System.out.println(catPlaying);

    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer) {
            if (temperature >= 25 && temperature <= 45) {
                return true;
            }
        } else if (!summer) {
            if (temperature >= 25 && temperature <= 35) {
                return true;
            }
        }
        return false;

    }

}
