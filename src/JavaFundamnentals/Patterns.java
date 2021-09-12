package JavaFundamnentals;

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
       // Scanner scn = new Scanner(System.in);
        int n = 5;
        pattern2(n);
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

    static void pattern2(int n){
        for (int i = 1; i <= n ; i++)
        {
            for (int j = 1; j <= n -i+1; j++)
            {
                System.out.print("*	");
            }

            System.out.println();
        }
    }
}