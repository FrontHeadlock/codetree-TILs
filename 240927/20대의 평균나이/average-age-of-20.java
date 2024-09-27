import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int cnt=0;
        float avg;

        while(true){
            int a = sc.nextInt();
            if(a<=19|a>=30){
                break;
            }
            else{
                sum+=a;
                cnt++;
            }
        }
        avg = (float)sum/cnt;
        System.out.printf("%.2f",avg);
    }
}