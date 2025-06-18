import java.util.Scanner;

public class part4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, i, prime = 1;
        System.out.print("fadlan gili lamaberka : ");
        num = input.nextInt();
        if (num <= 1) {
            prime = 0;
        }
        for (i = 2; i < num; i++) {
            if (num % i == 0) {
                prime = 0;
                break;
            }
        }
        if (prime == 1) {
            System.out.println(num + " lamberkan waa prime number.");
        } else {
            System.out.println(num + " lamberkan mahan prime number.");
        }

    }
}
