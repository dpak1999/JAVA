public class FloatAndDouble {
    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println(myMinFloatValue);
        System.out.println(myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println(myMinDoubleValue);
        System.out.println(myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = (float) 5.25 / 3;
        float mySecondFloatValue = 5f / 3;
        double myDoubleValue = 5d / 3;

        System.out.println(myIntValue + "," + myFloatValue + "," + mySecondFloatValue + "," + myDoubleValue);
    }
}
