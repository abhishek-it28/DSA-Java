import java.util.Scanner;
public class InputOutput {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        System.out.println("The sum of two number is:-" + (a+b));
        System.out.println("The difference is:-" + (a-b));
        System.out.println("The product is:-"+ (a*b));
    }
}
