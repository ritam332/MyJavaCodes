public class Method {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was : " + highScore);


        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was : " + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition=calculateHighScorePosition(900);
        displayHighScorePosition("Bob",highScorePosition);

        highScorePosition=calculateHighScorePosition(400);
        displayHighScorePosition("Maeve",highScorePosition);

        highScorePosition=calculateHighScorePosition(450);
        displayHighScorePosition("Otis",highScorePosition);

    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get a position " + highScorePosition + " on the high score table");
    }

//    public static int calculateHighScorePosition(int playerScore) {
//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500 && playerScore < 1000) {
//            return 2;
//        } else if (playerScore < 500 && playerScore >= 100) {
//            return 3;
//        } else return 4;
//
//    }

    public static int calculateHighScorePosition(int playerScore) {
        int position=4;

        if (playerScore >= 1000) {
            position=1;
        } else if (playerScore >= 500 ) {
            position=2;
        } else if ( playerScore >= 100) {
            position=3;
        } return position;

    }


    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;

        }
        return -1;
    }
}
