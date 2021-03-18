package HelloWorld.Challenges;

public class MinutesToYearsToDays {
    public static void main(String[] args) {
        printYearsAndDays(-525600);

    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");

        } else {
            long days = (minutes / 60) / 24;
            long remainMinutes = minutes % 60;
            long hours = (minutes / 60) % 24;
            long years = days / 365;
            days = days % 365;
            System.out.println(minutes + " min = " + years + " y " + days + " d");
        }

    }

}
