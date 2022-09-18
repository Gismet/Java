public class MiniProj1 {
    public static void main(String[] args) {
        int number = 33;

        if (number == 1) {
            System.out.println("Not prime number");
            return;
        }

        if (number < 1) {
            System.out.println("not proper number");
            return;
        }

        boolean isPrime = true;
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("The number is prime");
        } else {
            System.out.println("The number is not prime");
        }

    }
}