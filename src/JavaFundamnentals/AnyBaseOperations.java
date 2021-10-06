package JavaFundamnentals;

public class AnyBaseOperations {
    public static void main(String[] args) {
       // AnyBaseAddition(8, 236, 754);
       // AnyBaseSubtraction(8,256,1212);
       AnyBaseMultiplication(5, 1220, 31);
    }


    public static int SingledigitMultiplication(int base, int number1, int digit ){
        int carry =0;
        int rev = 0;
        int power = 1;
        while(number1>0 || carry>0){
            int digit1 = number1%10;
            number1/=10;
            int sum = digit1*digit+carry;
            carry = sum/base;
            int ans = sum%base;
            rev += ans*power;
            power*=10;
        }
        return rev;
    }
    private static void AnyBaseMultiplication(int base, int number1, int number2) {
        int answer = 0;
        int power =1;
        while(number2>0){
            int multiplier = number2%10;
            number2/=10;
            int sum = SingledigitMultiplication(base,number1,multiplier);
            sum*=power;
            answer = AnyBaseAddition(base,answer,sum);
            power*=10;
        }
        System.out.println(answer);

    }

    private static void AnyBaseSubtraction(int base , int number1, int number2) {
        int carry  =0;
        int power = 1;
        int returnvalue = 0;
        while(number2>0  ) {
            int rem1 = number1 % 10;
            int rem2 = number2 % 10;
            number1 /= 10;
            number2 /= 10;
            //assuming number 2 is always bigger than number 1:
            int ans;
            rem2 = rem2+carry;
            if(rem2>=rem1){
                carry = 0;
                ans = rem2-rem1;
            }
            else {
                carry = -1;
                ans = rem2+base-rem1;
            }
            returnvalue += ans*power;
            power*=10;
        }
        System.out.println(returnvalue);

    }

    private static int AnyBaseAddition(int base, int number1, int number2) {
        int carry  =0;
        int power = 1;
        int returnvalue = 0;

        while(number1>0|| number2>0 || carry>0 ){
            int rem1 = number1%10;
            int rem2 = number2%10;
            number1/=10;
            number2/=10;
            int sum = rem1+rem2+carry;
            carry = sum/base;
            int ans= sum%base;
            returnvalue += ans*power;
            power*=10;


        }
//        System.out.println(returnvalue);
        return returnvalue;
    }
}
