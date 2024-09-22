import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A_math = sc.nextInt();
        int A_eng = sc.nextInt();
        int B_math = sc.nextInt();
        int B_eng = sc.nextInt();

        if(A_math >= B_math) {
            if(A_math==B_math) {
                if(A_eng>=B_eng) {
                    System.out.println("A");
                }
                else{
                    System.out.println("B");
                }
            }
            else{System.out.println("A");}
        }
        else{
            System.out.println("B");
        }


        }
    }