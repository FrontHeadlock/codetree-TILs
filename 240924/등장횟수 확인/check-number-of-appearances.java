import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        int cnt = 0;
        for(int i =1; i<=5;i++){
            int k = sc.nextInt();
            if(k%2==0){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}