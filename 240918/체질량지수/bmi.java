import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();
        double b = (double)(10000 * w) / (h * h);

        int intB = (int) b;

        if (b < 25) {
            System.out.print(intB);
        } else {
            System.out.printf("%d\n", intB);
            System.out.print("Obesity");
        }
    }
}