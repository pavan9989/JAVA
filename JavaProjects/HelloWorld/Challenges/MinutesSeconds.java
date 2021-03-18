package HelloWorld.Challenges;

public class MinutesSeconds {
    public static void main(String[] args) {
        getDurationString(3600);

    }

    public static int getDurationString(int seconds, int minutes) {
        if (((seconds < 0) || (seconds > 60)) || (minutes < 0)) {
            System.out.println("Invalid value");
            return -1;
        }
        minutes = minutes + seconds / 60;
        seconds = seconds % 60;
        int hours = minutes / 60;
        minutes = minutes % 60;
        System.out.println(hours + " hours " + minutes + " minutes " + seconds + " seconds");
        return hours;

    }

    public static int getDurationString(int seconds) {
        if (seconds < 0) {
            System.out.println("Invalid value");
        }
        int minutes = seconds / 60;
        seconds = seconds % 60;
        return getDurationString(seconds, minutes);

    }
}
