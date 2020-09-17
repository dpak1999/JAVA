public class Main {
    public static void main(String[] args) {
        int count = 0;
        while(count != 5) {
            System.out.println("Count value is " + count);
            count ++;
        }

        count = 6;
        do {
            System.out.println("Count value is " + count);
            count++;
        } while (count != 6);
    }
}
