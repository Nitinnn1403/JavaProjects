import java.util.*;

public class BinarySearchTask{
    public static void main(String[] args) {
        int[] numbers = {2,4,7,10,14,18,21,25,30};

        int target = 18;
        int result = binarySearch(numbers, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        }   else {
            System.out.println("Element not found in the array.");
        }
    }
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1;
    }
}