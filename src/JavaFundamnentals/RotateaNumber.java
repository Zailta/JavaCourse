package JavaFundamnentals;

import java.util.Scanner;

public class RotateaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int k = sc.nextInt();
        int count = 0;
        int inc = 0;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        if (count == k) {
            System.out.println(n);
        } else {
            int sum = 0;
            int power = (int) Math.pow(10, k);
            int q = n / power;
            int pl =q;
            while(pl!=0){
                pl/= 10;
                inc++;
            }
            int rem = n % power;
            sum = (rem * (int) Math.pow(10, inc)) + q;
            System.out.println(sum);
        }
    }
}