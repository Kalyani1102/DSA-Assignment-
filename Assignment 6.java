import java.util.Scanner;

public class Assignment_6 {
    public static int binary(int[] nums, int target, boolean b) {
        int result = -1;
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                result = mid;
                if (b == true) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (target > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    public static int[] searchRange(int[] nums, int target) {
        int lower_index = binary(nums, target, true);
        int upper_index = binary(nums, target, false);
        int[] arr1 = { lower_index, upper_index };
        return arr1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] arr1 = searchRange(arr, target);
        for (int j = 0; j < arr1.length; j++) {
            System.out.printf("%d ", arr1[j]);
        }
    }
}
