import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a%2==0){
            System.out.printf("even\n");
        }
        else{
            System.out.printf("odd\n");
        }
        if(b%2==0){
            System.out.printf("even");
        }
        else{
            System.out.printf("odd");
        }
        }

    }