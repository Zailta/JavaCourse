package JavaFundamnentals;

import org.w3c.dom.ls.LSOutput;

public class EvenOddUsingBitwise {
    public static void main(String[] args) {
        int n =1076;
        System.out.println(isodd(n));
        EvenorOdd(n);
    }
    public static boolean isodd(int n){

       // one way of checking odd and even
        return (n & 1) ==0;
    }
    public static void EvenorOdd(int n ){
       // for odd check
        boolean check = (n&1) ==1;  // or you can try n&1 == 0 for even check.
        if(check){ // if true print number is odd else print number is even
            System.out.println("Number is odd");
       }
        else {
            System.out.println("Number is even");
        }
    }
}
