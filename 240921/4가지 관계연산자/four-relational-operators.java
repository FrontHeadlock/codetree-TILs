import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>=b){
            System.out.printf("1\n");
        }
        else{
            System.out.printf("0\n");
        }
        if(a>b){
            System.out.printf("1\n");
        }
        else{
            System.out.printf("0\n");
        }
        if(b>=a){
            System.out.printf("1\n");
        }
        else{
            System.out.printf("0\n");
        }
        if(b>a){
            System.out.printf("1\n");
        }
        else{
            System.out.printf("0\n");
        }
        }
    }