import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
       int[] marks = {80, 75, 90, 85, 70};

        System.out.println(marks[0]);
        System.out.println(marks[2]);
        System.out.println(marks[4]);

        int[] arr = new int[5];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
            Scanner sc = new Scanner(System.in);
            int r = sc.nextInt();

            int [] arr11 = new int[r];

            for (int i = 0; i<r;i++){
                arr11[i]= sc.nextInt();
            }

        for (int i = 0; i < arr11.length; i++) {
            System.out.println(arr11[i]);
        }
        }
        }

