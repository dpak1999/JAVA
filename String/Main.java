public class Main {
    public static void main(String[] args) {
        String myString = "I love you";
        System.out.println(myString);

        myString = myString + " very very much";
        System.out.println(myString);

        myString = "Hey baby " + myString;
        System.out.println(myString);

        myString = myString + '\u2764';
        System.out.println(myString);

        String lastString = "28";
        int myInt = 29;
        
        System.out.println(lastString);
        lastString = myInt + lastString;
        System.out.println(lastString);
    }
}
