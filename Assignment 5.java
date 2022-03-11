import java.util.Scanner;

class Assignment_5 {
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int temp = 0;
        int min = arr[0];
        int r = sc.nextInt();
        for (int i = 0; i < r; i++) {

            for (int j = n - 1; j > 0; j--) {
                temp = arr[n - 1];
                arr[j] = arr[j - 1];

            }
            arr[0] = temp;
        }
        int result = findMin(arr);
        System.out.println(result);

    }
}
