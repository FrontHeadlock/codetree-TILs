import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int cnt =0;

        while(N!=1){
            if(N%2==0){
                N=N/2;
            }
            else if(N%2==1){
                N=N*3+1;
            }
            cnt++;
        }

        System.out.printf("%d",cnt);
        
    }
}