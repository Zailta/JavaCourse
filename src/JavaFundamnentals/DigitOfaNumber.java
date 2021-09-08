package JavaFundamnentals;

import java.util.Scanner;

public class DigitOfaNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number  = 123456;
        int count = 0;
        int temp = number;


        while(temp!=0){
            temp = temp/10;
            count++;
        }
        int div  = (int) Math.pow(10, count-1);
        while (div!=0){
            int qoutient = number/div;
            System.out.println(qoutient);
            number = number%div;
            div /=10;

        }


    }
}
