package JavaFundamnentals;

public class Conversions {
    public static void main(String[] args) {
        int n = 2;
        int sourcebase = 2;
        int destinationbase = 8;
//        DecimalToAnyBase(n,base);
        AnyBaseToAnyBase(n, sourcebase, destinationbase);


    }

    public static void AnyBaseToAnyBase(int n, int src, int dest) {
        int anybasetodecimal = DecimalToAnyBase(n,src);
        int decimaltoanybase = AnyBaseToDecimal(anybasetodecimal, dest);
        System.out.println(decimaltoanybase);

    }

    public static int  DecimalToAnyBase(int n, int b){
        int sum =0;
        int p= 1;
        // write code here
        while(n>0){
            int temp = n%b;
            n = n/b;
            sum += (temp*p);
            p*=10;


        }
        return sum;
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
