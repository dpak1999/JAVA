public class Main {
    public static void main(String[] args) {

        for (int i = 1;i <= 10;i++) {
            System.out.println("10000 at "+ i +"% interest is " + String.format("%.3f",calculateInterest(10000,i)));
        }
        System.out.println(isPrime(25));
    }

    public static boolean isPrime(int n) {
        if (n==1) {
            return false;
        }
        for (int i = 2; i<=n/2; i++ ) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount,double interestRate) {
        return (amount * (interestRate/100));
    }
}
