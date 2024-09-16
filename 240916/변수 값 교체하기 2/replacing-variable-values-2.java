public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int temp = a;
        int a = b;
        b = temp;
        System.out.printf("%d %d",a,b);
    }
}