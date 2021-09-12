package JavaFundamnentals;

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern1(n);
    }
    static void pattern1(int n){
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++) //MAGIC LOOP
            {
                System.out.print("*	");
            }
            System.out.println();
        }
    }
}