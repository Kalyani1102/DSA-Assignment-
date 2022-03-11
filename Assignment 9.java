import java.util.Scanner;

public class Assignment_9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i], index = i;
            for (int j = i + 1; j < arr.length; j++) {

                if (min > arr[j]) {
                    min = arr[j];
                    index = j;
                }
            }

            int temp = arr[i];

            arr[i] = min;

            arr[index] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
