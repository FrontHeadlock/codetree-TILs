import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a%2==0) {
            for (int i = a+1; i < b + 1;i+=2){
                System.out.printf("%d ",i);
            }
        }
        else{
            for (int i = a; i < b + 1;i+=2){
                System.out.printf("%d ",i);
            }
        }
    }
}