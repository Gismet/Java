public class WorkingWithStrings1 {
    public static void main(String[] args) {
        String text = "Good";
        System.out.println(text);

        System.out.println("Text length: " + text.length());
        System.out.println("2nd element: " + text.charAt(1));
        System.out.println(text.concat(" Lesson!"));
        System.out.println(text.startsWith("G"));
        System.out.println(text.endsWith("b"));
        String text2 = "This is good";
        char[] chars = new char[4];

        text2.getChars(0, 4, chars, 0);
        System.out.println(chars);
        System.out.println("The index of g in text2: " + text2.indexOf('g'));
        System.out.println(text2.lastIndexOf('s'));

        System.out.println(text2.replace(' ', '*'));
        System.out.println(text.substring(1, 3));

        for (String word : text2.split(" ")) {
            System.out.println(word);
        }

        System.out.println(text2.toUpperCase());
        System.out.println(text2.toLowerCase());
        String finalText = " Thank you! ";
        System.out.println(finalText.trim());
    }
}