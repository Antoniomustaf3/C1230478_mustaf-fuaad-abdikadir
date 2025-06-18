import java.util.Scanner;
public class part1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter a value: ");
        int input = scanner.nextInt();
        String upper_letter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower_letter = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String special_character = "@#$&";
        String all = upper_letter + lower_letter + digits+special_character;
        String paswords= "";
        for (int i = 0; i < input; i++)
        {
            int x = (int)(Math.random() * all.length());
            paswords+= all.charAt(x);
        }

        System.out.println("fadaln gili password :  " +paswords);

}
 }
