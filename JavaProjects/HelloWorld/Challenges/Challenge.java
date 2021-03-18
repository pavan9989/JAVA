package HelloWorld;

public class Challenge {
    public static void main(String[] args) {
        double myFirstDouble = 20.00d;
        double mySecondDouble = 80.00d;
        double myThirdDouble = (myFirstDouble + mySecondDouble) * 100.00d;
        double myReminderDouble = myThirdDouble % 40.00d;
        boolean myBoolean = myReminderDouble == 0.00d ? true : false;
        System.out.println(myBoolean);
        if (myBoolean == false) {
            System.out.println("got some thing else reminder");
        }

    }

}
