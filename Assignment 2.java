package Solution;

import java.util.Scanner;

public class Assignment_2 {
    static int binary(char[] arr, char target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (target < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        char[] arr = { 'a', 'b', 'd', 'e', 'f', 'g', 'h', 'i', 'x', 'z' };
        char target = 'z';
        int index = binary(arr, target);
        System.out.println(index);
    }
}
