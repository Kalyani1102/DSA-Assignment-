package Solution;

import java.util.Scanner;

public class Assignment_4 {
    static int binary(int[] arr, int target) {
        int result = -1;
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
                result = low;
            } else {
                high = mid - 1;
                result = high + 1;
            }
        }
        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        int result = binary(arr, target);
        System.out.println(result);
    }

}
