package JavaFundamnentals;

import java.util.Scanner;

public class FibonacciUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            int res = fibonacci(i);
            System.out.println(res);

        }
    }
    public static int fibonacci(int n){
        if(n==1)
            return 1;
        else if(n ==0)
            return 0;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }
}
