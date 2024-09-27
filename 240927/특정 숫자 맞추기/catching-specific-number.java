import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int a= sc.nextInt();
            if(a<25){
                System.out.printf("Higher\n");
            }
            else if(a>25){
                System.out.printf("Lower\n");
            }
            else{
                System.out.printf("Good");
                break;
            }
        }
    }
}