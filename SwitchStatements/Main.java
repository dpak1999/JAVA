public class Main {
    public static void main(String[] args) {
        int switchValue = 4;
        switch (switchValue) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("value is 2");
                break;
            case 3: case 4: case 5:
                System.out.println("either 3, 4 or 5");
                break;
            default:
                System.out.println("Invalid");
        }

        char charValue = 'A';
        switch (charValue) {
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C':
                System.out.println("C was found");
                break;
            case 'D':
                System.out.println("D was found");
                break;
            default:
                System.out.println("Nothing was found");
        }
    }
}
