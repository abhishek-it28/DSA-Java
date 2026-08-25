import java.util.Scanner;
public class IfElse {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num<0 && num%2==0) {
            System.out.println("The given number is Even and Negative " + num);
        }
        else if(num<0 && num%2!=0){
                System.out.println("The given number is Odd and Negative " + num);
            } else if(num>0 && num%2==0) {
            System.out.println("The given number is Even and Positive " + num);
        } else if (num == 0) {
            System.out.println("The given number is  even but neither positive nor negative " + num);
        } else{
                    System.out.println("The given number is Odd and Positive" + num);
                }


            }

        }



