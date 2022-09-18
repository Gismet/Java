public class ReCapDemo2Vid15 {

    public static void main(String[] args) {
        double myList[] = { 2.3, 5.0, 6.2, 1.3, 4.5, 3.4, 2.8 };
        double total = 0;
        double max = myList[0];
        for (double number : myList) {
            if (max < number) {
                max = number;
            }
            total += number;
            System.out.println(number);
        }
        System.out.println("The Total : " + total);
        System.out.println("The max number : " + max);
    }
}