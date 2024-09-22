import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s_1 = sc.next();
        int a = sc.nextInt();
        String s_2 = sc.next();
        int b = sc.nextInt();
        String s_3 = sc.next();
        int c = sc.nextInt();

        int cnt=0;

        if(s_1.equals("Y")){
            if(a>=37){
                cnt+=1;
            }
        }
        if(s_2.equals("Y")){
            if(b>=37){
                cnt+=1;
            }
        }
        if(s_3.equals("Y")){
            if(c>=37){
                cnt+=1;
            }
        }

        if(cnt>=2){
            System.out.println("E");
        }
        else{
            System.out.println("N");
        }

        }
    }