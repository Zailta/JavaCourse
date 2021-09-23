package JavaFundamnentals;

import java.util.Scanner;

public class FrequencyOfaDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number  = sc.nextInt();
        int fnumber  =sc.nextInt();
        int count  =0;
        while(number !=0){
            int temp = number %10;
            number = number /10;
            if(temp == fnumber){
                count ++;
            }
        }
        System.out.println(count);
    }
}
