public class CalcFeet {
    public static void main(String[] args) {
//        InchesToCentimeter(-6 , 0);
        InchesToCentimeter(100);
        InchesToCentimeter(-156);
    }

    public static double InchesToCentimeter(double feet,double inches) {
        if (feet < 0 || (inches > 12 && inches < 0)) {
            System.out.println("Please enter valid numbers");
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet " + inches + " inches = " + centimeters + " cm.");
        return centimeters;
    }

    public static double InchesToCentimeter(double inches) {
        if (inches < 0) {
            System.out.println("Enter valid number");
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches.");
        return InchesToCentimeter(feet,remainingInches);
    }
}
