package JavaFundamnentals;

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
       // Scanner scn = new Scanner(System.in);
        int n = 5;
        pattern10(n);
    }

    public static void pattern10(int n) {
        int os = n/2;
        int is =-1;
        for(int i = 1; i<=n;i++){
            /*
            concept for the pattern si to first print outer spaces and then inner spaces
            Print inner and outer starts in mentioned convention:
            2, -1
            1, 1
            0, 3
            1, 1
            2, -1

             */
           for(int j = 1; j<=os;j++){
               System.out.print("\t");
           }
            System.out.print("*\t");
           for(int k = 1; k<=is; k++){
               System.out.print("\t");
           }

            /*
             * If condition to ensure that for top and bottom stars the stars gets printed from the outer loop only
             */
            if(i>1 && i<n){
               System.out.print("*\t");
         }
            if(i<=n/2){
                os--;
                is+=2;
            }else{
                os++;
                is-=2;
            }

            System.out.println();

        }
    }

    public static void pattern9(int n) {
      for(int i = 1; i<= n; i++){
          for(int j = 1; j<=n ;j++){
              if(i+j == n+1 || i==j){
                  System.out.print("*\t");
              }
              else {
                  System.out.print("\t");
              }
          }
          System.out.println();
      }
    }

    public static void pattern8(int n) {
/* brute force approach :
 for(int i = 1; i<=n;i++){
            for(int j = 1; j<i; j++){
                System.out.print("\t");
            }
            for(int k =1; k ==1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
 */

        for (int i = 1; i <= n; i++) {
            /* brute force approach :
 for(int i = 1; i<=n;i++){
            for(int j = n; j>=i; j--){
                System.out.print("\t");
            }
            for(int k =1; k ==1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
 */
            for (int j = 1; j <= n; j++) {
                if (i == j)
                    System.out.print("*\t");

                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }

    public static void pattern7(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i + j == n + 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }

            System.out.println();
        }

    }

    static void pattern6(int n){
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++) //MAGIC LOOP
            {
                System.out.print("*	");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for (int i = 1; i <= n ; i++)
        {
            for (int j = 1; j <= n -i+1; j++)
            {
                System.out.print("*	");
            }

            System.out.println();
        }
    }
    static  void pattern4(int n){
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
    static void pattern3(int n){
        for(int i =1; i<= n; i++ ){
            for(int j = 1; j<i; j++){
                System.out.print("\t");
            }for(int k = 1; k<=n-i+1; k++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
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

    static void pattern1(int n){
        int temp = n+1;
        int spaces  = 1;
      // int stars = temp/2;
        for(int i = 1;i<=n;i++){
            //System.out.println(temp+" "+spaces);
            for(int j =1; j<=temp/2; j++){
                System.out.print("*\t");
            }
            for(int k = 1; k<=spaces; k++){
                System.out.print("\t");
            }
            for(int j =1; j<=temp/2; j++){
                System.out.print("*\t");
            }
            if(i <= temp/2){
                spaces +=2;
                temp -=2;
            }
            else {

                spaces-=2;
                temp+=2;
            }
                System.out.println();

        }

    }
}