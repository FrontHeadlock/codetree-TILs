import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int s = a+n;

        for(int i =1;i<=n;i++){
            System.out.printf("%d\n",s);
            s+=n;
        }

    }
}