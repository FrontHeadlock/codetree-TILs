import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum=0;
        int i;

        for(i=a;i<=b;i++){
            sum+=i;
        }
        System.out.printf("%d",sum);
    }
}