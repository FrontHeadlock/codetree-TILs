import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = n; i >= 2; i--) {
            for (int k = 1; k <= 4; k++) {
                if (k <= i) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    if (k < i) {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        System.out.println("*");
    }
}