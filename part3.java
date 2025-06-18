import java.util.Scanner;
public class part3 {
    public static void main(String[] args) {
        String stops = "j";
        int total_sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("fadlan gili address j si aan kugu fulino: ");

        while (true) {
            System.out.println("enter number :");
            String stop = input.nextLine();
            char n = stop.charAt(0);
            if (n == 'j') {
                break;
            } else {
                int number = Integer.parseInt(stop);
                total_sum += number;
            }


        }
        System.out.println("the sum number is : "+total_sum);}

}
