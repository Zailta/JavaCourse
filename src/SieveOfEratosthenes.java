import java.util.Arrays;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 40;
        boolean [] prime = new boolean[n+1]; // by default the boolean array is set to false.
        System.out.println(!prime[0]);
       Arrays.fill(prime, true);
        sieve(n, prime);
        biwiseseive(n, prime);
    }

    private static void sieve(int n, boolean[] prime) {
        for(int i =2;i<=Math.sqrt(n);i++){
            if(prime[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }
        for(int i = 2; i<=n;i++) {
            if (prime[i]){
                System.out.print(i+ " ");
            }
        }
    }
    private static void biwiseseive(int n, boolean[] prime) {
        /*We know how to calculate all primes less than n by the Sieve of Eratosthenes. Below is an implementation of Sieve.
One optimization in the below implementation is, we have skipped all even numbers altogether.
We reduce the size of the prime array to half. We also reduce all iterations to half.
         */
        for(int i =3;i<Math.sqrt(n);i+=2){
            if(prime[i]) {
                for (int j = i * i; j <n; j += i) {
                    prime[j] = false;
                }
            }
        }

        //print 2 separately
        System.out.print("2 ");
        for(int i = 3; i<n;i+=2) {
            if (prime[i]){
                System.out.print(i+ " ");
            }
        }
    }

}
