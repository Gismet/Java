public class MiniProj2 {
    public static void main(String[] args) {
        char letter = 'A';

        switch (letter) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalin sesli harf");
                break;
            default:
                System.out.println("Ince sesli harf");
        }
    }
}