package JavaFundamnentals;

import java.util.Scanner;

public class InverseOfaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int temp = n;
        int count = 0;
        int sum =0;
        while(n!=0){
            int div = n%10;
            count++;
            n= n/10;
            sum+= count*((int)Math.pow(10, div-1));
        }
        System.out.println(sum);
    }
}
