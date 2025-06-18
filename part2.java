import java.util.Scanner;
public class part2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word, reverse = "";

        System.out.print("Fadlan geli number ama xaraf : ");
        word = input.nextLine();

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }

        if (word.equals(reverse)) {
            System.out.println(word + " waa palindrome.");
        } else {
            System.out.println(word + " ma ahan palindrome.");
        }

        input.close();

    }
}
