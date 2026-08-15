public class Main {
    public static void main(String[] args) {

        int[] arr = {10, 25, 15, 45, 35};

        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Largest element = " + largest);
    }
}
