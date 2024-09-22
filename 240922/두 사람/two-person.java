import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A_age = sc.nextInt();
        String A_gender = sc.next();
        int B_age = sc.nextInt();
        String B_gender = sc.next();

        if((A_age>=19 && A_gender.equals("M"))||(B_age>=19 && B_gender.equals("M"))){
            System.out.print("1");
        }
        else{
            System.out.print("0");
        }
        }
    }