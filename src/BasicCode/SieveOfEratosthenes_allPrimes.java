package BasicCode;

public class SieveOfEratosthenes_allPrimes {
    public static void main(String[] args) {

        // Sieve of Eratosthenes
        // Prime numbers that are strictly less than n

        int n = 40;     // primes less than 40
        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i < n; i++) {
            prime[i] = true;
        }

        for (int i = 2; i * i < n; i++) {
            if (prime[i]) {
                for (int j = i * 2; j < n; j += i) { //int j = i*i
                    prime[j] = false;
                }
            }
        }

        for (int i = 2; i < n; i++) {
            if (prime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
