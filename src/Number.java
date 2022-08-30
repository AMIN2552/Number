import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = a / 10;
        int c = b % 10;
        System.out.println(c);
    }
}
