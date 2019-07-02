public class LargestPrime {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }

    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }
        int maxPrime = 0;

        while (number % 2 == 0) {
            maxPrime = 2;
            number /= 2;
        }

        // number must be odd at this point,
        // thus skip the even numbers
        // and iterate only for odd
        // integers
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                maxPrime = i;
                number = number / i;
            }
        }

        // This condition is to handle
        // the case when number is a prime
        // number greater than 2
        if (number > 2)
            maxPrime = number;

        return maxPrime;
    }
}

