
public class Switch {
    public static void main(String[] args) {
        char grade = 'B';

        switch (grade) {

            case 'A':
                System.out.println("Excellent: you passed!");
                break;
            case 'B':
                System.out.println("Very good: you passed!");
                break;
            case 'C':
                System.out.println("Good: you passed!");
                break;
            case 'D':
                System.out.println("Not bad: you passed!");
                break;
            case 'F':
                System.out.println("You failed!");
                break;
            default:
                System.out.println("You entered wrong grade");
        }
    }
}