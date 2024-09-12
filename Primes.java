public class Primes {
    public static void main(String[] args) {
        for (int n = 2; n < 100; n++){
            if (IsPrime(n)){
                System.out.println(n + " Простое число");
            } else {
                System.out.println(n + " Не простое число");
            }
        }
    }
    public static boolean IsPrime(int n) {
        for ( int x = 2; x < n; x++) {
            if (n % x == 0) {
                return false;
            }
        }
        return true;
    }
    }