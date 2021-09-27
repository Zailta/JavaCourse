import java.util.Arrays;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 40;
        boolean [] prime = new boolean[n+1]; // by default the boolean array is set to false.
        System.out.println(!prime[0]);
       Arrays.fill(prime, true);
        sieve(n, prime);
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

}
