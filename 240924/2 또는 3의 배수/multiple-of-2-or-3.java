import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int b = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            if(i%2==0 | i%3==0) {
                System.out.printf("%d ",1);
            }
            else{
                System.out.printf("%d ",0);
            }
        }

    }
}