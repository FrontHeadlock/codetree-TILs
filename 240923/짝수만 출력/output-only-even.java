import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        while(a<=b){
            if(a%2==0){
                System.out.printf("%d ",a);
                a+=2;
            }
            else{
                a+=1;
                System.out.printf("%d ",a);
                a+=2;
            }
        }

    }
}