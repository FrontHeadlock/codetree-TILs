import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int a = sc.nextInt();
        if(b%2==0) {
            for(int i = b-1; i >= a; i -= 2) {
                System.out.printf("%d ",i);
            }
        }
        else{
            for(int i=b;i>=a;i-=2){
                System.out.printf("%d ",i);
            }
        }
    }
}