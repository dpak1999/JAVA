public class charAndBoolean {
    public static void main(String[] args) {
        char myChar = 'I';
        char myUnicodeCharacter = '\u0044';
        System.out.println(myChar);
        System.out.println(myChar + "" + myUnicodeCharacter);

        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);

        boolean myTrueBool = true;
        boolean myFalseBool = false;
        System.out.println(myTrueBool);
    }
}
