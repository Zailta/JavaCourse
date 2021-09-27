package JavaFundamnentals;

public class Conversions {
    public static void main(String[] args) {
        int n = 100;
        int base = 2;
        DecimalToAnyBase(n,base);

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
}
