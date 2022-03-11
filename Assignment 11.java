import java.util.Scanner;

public class TwoSum {
    public static int[] two_sum(int[] arr, int target_sum) {
        int[] arr1 = { -1, -1 };
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target_sum) {
                    arr1[0] = i;
                    arr1[1] = j;
                }
            }
        }
        return arr1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target_sum = sc.nextInt();
        int[] result = two_sum(arr, target_sum);
        for (int k = 0; k < 2; k++) {
            System.out.printf("%d ", result[k]);
        }
    }
}
