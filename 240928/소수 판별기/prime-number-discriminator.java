import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt=0;

        for(int i=2;i<n;i++) {
            if(n%i==0) {
                cnt++;
                break;
            }
        }
        if(cnt==1){
            System.out.println("C");
        }
        else{
            System.out.println("P");
        }

    }
}