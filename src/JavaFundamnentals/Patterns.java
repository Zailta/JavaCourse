package JavaFundamnentals;

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
       // Scanner scn = new Scanner(System.in);
        int n = 5;
        pattern5(n);
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
    static  void pattern3(int n){
        for(int i = 1; i<=n;i++){
            for(int j= 1; j<= n-i; j++){
                System.out.print(" \t");
            }
            for(int k = 1; k<= i; k++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for(int i =1; i<= n; i++ ){
            for(int j = 1; j<i; j++){
                System.out.print("\t");
            }for(int k = 1; k<=n-i+1; k++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        int spaces = n/2;
        int stars  = 1;
        for(int i = 1; i<=n ;i++){

            for(int j = 1;j<=spaces;j++){
                System.out.print("\t");
            }
            for(int k = 1; k<=stars; k++){
                System.out.print("*\t");
            }
            if(i <= n/2){
                spaces--;
                stars+=2;
            }
            else {
                spaces ++;
                stars -=2;
            }
            System.out.println();

        }

    }
}