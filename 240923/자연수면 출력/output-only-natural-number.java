import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>0){
            for(int i=1; i<=b;i++){
                System.out.printf("%d",a);
            }
        }
        else if(a<=0){
            System.out.print(0);
        }

    }
}