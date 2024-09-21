import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        if(a%2==0){
            int k = a/2;
            if(k%2==1){
                int k1 = (k+1)/2;
                System.out.print(k1);
            }
            else{
                System.out.print(k);
            }
        }
        else{
            int q = (a+1)/2;
            System.out.print(q);
        }

    }
}