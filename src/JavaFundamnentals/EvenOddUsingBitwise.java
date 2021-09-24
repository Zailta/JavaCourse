package JavaFundamnentals;

import org.w3c.dom.ls.LSOutput;

public class EvenOddUsingBitwise {
    public static void main(String[] args) {
        int n =1076;
        System.out.println(isodd(n));
      //  EvenorOdd(n);
    }
    public static boolean isodd(int n){

       // one way of checking odd and even
        return (n & 1) ==0;
    }

}
