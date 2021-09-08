package JavaFundamnentals;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i<t; i++){
            int number  = sc.nextInt();

            int count =0;
            for(int j = 2; j<= Math.sqrt(number); j++){
                if(number%j == 0){
                    count++;
                }
            }

            if(count ==0)
                System.out.println("prime");
            else
                System.out.println("not prime");

        }

    }
}