public class ByteShortIntLong {
    public static void main(String args[]) {
//        Integer
        int IntMinValue = Integer.MIN_VALUE;
        int IntMaxValue = Integer.MAX_VALUE;
        System.out.println(IntMinValue);
        System.out.println(IntMaxValue);

        int overMax = 2147483647 + 1;
        System.out.println(overMax);

//        Byte
        byte ByteMinValue = Byte.MIN_VALUE;
        byte ByteMaxValue = Byte.MAX_VALUE;

        System.out.println(ByteMinValue);
        System.out.println(ByteMaxValue);

//        Short
        short ShortMinValue = Short.MIN_VALUE;
        short ShortMaxValue = Short.MAX_VALUE;

        System.out.println(ShortMinValue);
        System.out.println(ShortMaxValue);

//        Long
        long LongMinValue = Long.MIN_VALUE;
        long LongMaxValue = Long.MAX_VALUE;

        System.out.println(LongMinValue);
        System.out.println(LongMinValue);

        long shortLong = 2134454155;
        long bigLong = 54121545454545L;

        System.out.println(shortLong);
        System.out.println(bigLong);

//        Casting
        int numberOne = 2122;
        short numberTwo = 326;

        byte numberThree = (byte) (numberTwo / 2);
        System.out.println(numberThree);

        short newShort = (short) (ShortMinValue / 2);
        System.out.println(newShort);
    }
}
