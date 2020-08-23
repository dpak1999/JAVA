public class Variables {
     public static void main(String args[]) {
         int myFirstNumber = 2001; //Initialized
         System.out.println(myFirstNumber);

         int mySecondNumber; //uninitialized
         System.out.println(mySecondNumber=1999);

         int sum = myFirstNumber+mySecondNumber;
         System.out.println(sum);

         int myLastOne = 1000 - sum;
         System.out.println(myLastOne);

     }
}
