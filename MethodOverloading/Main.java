public class Main {
    public static void main(String[] args) {
        int newScore = CalculateScore("Deepak" , 500);
        System.out.println("New score is " + newScore);

        CalculateScore(100);
        CalculateScore();

    }

    public static int CalculateScore(String playerName,int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;

    }

    public static int CalculateScore(int score) {
        System.out.println("Player scored " + score + " points");
        return score * 1000;

    }

    public static int CalculateScore() {
        System.out.println("No Player scored points");
        return 0;
    }
//    public static int CalculateScore() {
//        System.out.println("No Player scored points");
//        return 0;
//    }
}
