package JavaFundamnentals;

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
       // Scanner scn = new Scanner(System.in);
        int n = 5;
        pattern13(n);
       /*
        pattern9(n);
        pattern8(n);
        pattern7(n);
        pattern6(n);
        pattern5(n);
        pattern4(n);
        pattern3(n);
        pattern2(n);
        pattern1(n);

        */

    }

    private static void pattern13(int n) {
        for (int i = 0; i < n ; i++)
        {
            int icj = 1;
            for (int j = 0; j <= i; j++)
            {
                System.out.print( icj + "	");
                //using the following formula we can predict the j+1 element in the triangle: C_(k+1)^n=(C_k^n.(n-k))/(k+1).
                icj = (icj * (i - j)) / (j + 1);

            }
            System.out.println();
        }
    }

    public static void pattern12a(int n) {
        int a =0, b =1;
        for(int i = 1; i<=n;i++){
            for(int j =1; j<=i;j++) {
                System.out.print(a+"\t");
                int c = a + b;
                a = b;
                b = c;
            }
            System.out.println();
        }
    }

    public static void pattern12(int n) {
        int sum =1;
        for(int i = 1; i<=n; i++){
            for(int j =0; j<i; j++){
                sum = sum +j;
                System.out.print(sum+"\t");
            }
            System.out.println();
        }


    }

    public static void pattern11(int n) {
        int count  =1;
        for(int i = 1; i<=n ;i++){
            for(int j =1; j<i; j++){
                System.out.print(count+"\t");
                count++;
            }
            System.out.println();
        }

    }
/*
Below are the pattern to be covered in the programs. The programs are in sequence of the functions being called:
1. pattern10(n);
		*
	*		*
*				*
	*		*
		*
2. pattern9(n);
*				*
	*		*
		*
	*		*
*				*
3. pattern8(n);
*
	*
		*
			*
				*
4. pattern7(n);
				*
			*
		*
	*
*
5. pattern6(n);
*
*	*
*	*	*
*	*	*	*
*	*	*	*	*
6. pattern5(n);
*	*	*	*	*
*	*	*	*
*	*	*
*	*
*
7. pattern4(n);
 	 	 	 	*
 	 	 	*	*
 	 	*	*	*
 	*	*	*	*
*	*	*	*	*
8. pattern3(n);
*	*	*	*	*
	*	*	*	*
		*	*	*
			*	*
				*
9. pattern2(n);
		*
	*	*	*
*	*	*	*	*
	*	*	*
		*

10.  pattern1(n);
*	*	*		*	*	*
*	*				*	*
*						*
*	*				*	*
*	*	*		*	*	*

 */

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

            Pattern printed is as follows:
		*
	*		*
*				*
	*		*
		*

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
/*
to solve cross pattern problem we take reference of graph points
*				*
	*		*
		*
	*		*
*				*

for each print point we print "*" only if i==j  or i+j ==n+1
if we take a closer look the pattern spaces seem analogous to rt. angled two triangles facing each other

 	 	 	 	*
 	 	 	*	*
 	 	*	*	*
 	*	*	*	*
*	*	*	*	*


*
*	*
*	*	*
*	*	*	*
*	*	*	*	*
 */

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