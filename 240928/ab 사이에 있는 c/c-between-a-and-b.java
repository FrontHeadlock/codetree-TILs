import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int cnt = 0;
        while(a<=b){
            if(a%c==0){
                System.out.println("YES");
                cnt++;
                break;
            }
            a++;
        }
        if(cnt==0)
            System.out.println("NO");
    }
}