
public class TheBiggestNumber {
    public static void main(String[] args) {

        int number1 = 7;
        int number2 = 2;
        int number3 = 11;
        // en buyuk sayiyi bulmak
        if (number1 > number2 && number1 > number3) {
            System.out.printf("The biggest number : %d", number1);
        } else if (number2 > number1 && number2 > number3) {
            System.out.printf("The biggest numer: %d", number2);
        } else {
            System.out.printf("The biggest number: %d", number3);
        }
    }

}