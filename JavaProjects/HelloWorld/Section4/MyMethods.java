package HelloWorld.Section4;

public class MyMethods {
    public static void main(String[] args) {
        int postion = calculatedHighScorePosition(1500);
        displayHighScorePosition("Pavan", postion);
        postion = calculatedHighScorePosition(900);
        displayHighScorePosition("surekha", postion);
        postion = calculatedHighScorePosition(200);
        displayHighScorePosition("Aadya", postion);
        postion = calculatedHighScorePosition(50);
        displayHighScorePosition("Aarav", postion);

    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get in to position " + position);

    }

    public static int calculatedHighScorePosition(int playerScore) {

        if (playerScore >= 1000) {

            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        } else {
            return 4;
        }
    }

}
