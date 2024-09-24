import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i =1; i<=n;i++){
            int k = sc.nextInt();
            if(k%3==0&&(k+1)%2==0){
                System.out.printf("%d\n",k);
            }
        }
    }
}