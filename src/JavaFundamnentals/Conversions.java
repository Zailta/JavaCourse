package JavaFundamnentals;

public class Conversions {
    public static void main(String[] args) {
        int n = 100;
        int base = 2;
        DecimalToAnyBase(n,base);
        int i = AnyBaseToDecimal(n, 2);
        System.out.println(i);

    }
    public static void DecimalToAnyBase(int n, int b){
        int sum =0;
        int p= 1;
        // write code here
        while(n>0){
            int temp = n%b;
            n = n/b;
            sum += (temp*p);
            p*=10;


        }
        System.out.println(sum);
    }

    public static int AnyBaseToDecimal(int n, int b){
        // write your code here
        int p  =0;
        int sum = 0;
        while (n>0){
            int digit = n%10;
            sum += digit*((int) Math.pow(b,p));
            n = n/10;
            p++;
        }
        return sum;
    }
}
