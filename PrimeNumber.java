public class PrimeNumber {

    public static void main(String[] args) {
        for (int n = 3; n < 100; n++) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break; // Not prime, no need to check further
                }
            }

            if (isPrime) {
                System.out.println(n);
            }
        }
    }
}
