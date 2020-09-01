public class Main {
    public static void main(String[] args) {
        int score = 100;
        int topScore = 81;
        int myScore = 600;

        if(myScore > topScore && myScore < score) {
            System.out.println("Greater than top score but less than " + score);
        }

        if(topScore > 80 || myScore <= 90) {
            System.out.println("Either or both are true");
        }

//        Ternary
        int number = 10;
        String result;
        result = (number > 20) ? "Greater than 20" : "Less than 20";
        System.out.println(result);

        int age = 10;
        String isOver18;
        isOver18 = (age > 18) ? "Allowed to vote" : "not allowed to vote";
        System.out.println(isOver18);
    }
}
