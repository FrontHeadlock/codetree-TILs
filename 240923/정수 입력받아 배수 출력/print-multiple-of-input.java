import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = n; i<(5*n+1); i+=n){
            System.out.printf("%d ",i);
        }
    }
}