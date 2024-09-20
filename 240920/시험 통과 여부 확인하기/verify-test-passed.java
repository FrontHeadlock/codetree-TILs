import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n>80){
            System.out.print("pass");
        }
        else{
            int k = 100-n;
            System.out.printf("%d more score",k);
        }
    }
}