import java.util.*;

class Main {
    static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();

        StringBuilder ans1 = new StringBuilder();
        StringBuilder ans2 = new StringBuilder();

        // First word: replace vowels with %
        for (char ch : s1.toCharArray()) {
            if (isVowel(ch))
                ans1.append('%');
            else
                ans1.append(ch);
        }

        // Second word: replace consonants with #
        for (char ch : s2.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (isVowel(ch))
                    ans2.append(ch);
                else
                    ans2.append('#');
            } else {
                ans2.append(ch);
            }
        }

        // Third word: uppercase
        s3 = s3.toUpperCase();

        System.out.println(ans1.toString() + ans2.toString() + s3);
    }
}