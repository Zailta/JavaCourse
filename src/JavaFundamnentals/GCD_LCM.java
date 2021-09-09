package JavaFundamnentals;

import java.util.Scanner;

public class GCD_LCM {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int tn1 = scn.nextInt();
        int tn2 = scn.nextInt();
        int n1 =tn1;
        int n2 = tn2;
        while (n1 % n2 != 0)
        {
            int remainder = n1 % n2;
            n1 = n2;
            n2 = remainder;
        }
        int gcd = n2;
        int lcm = (tn1*tn2)/gcd;
        System.out.println(gcd);

        System.out.println(lcm);
    }
}
