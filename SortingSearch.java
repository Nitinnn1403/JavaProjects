//Simple Bubble Sorting and Binary Search and Linear Search.
import java.util.Arrays;
import java.util.Scanner;
public class SortingSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println("Enter the element to search:");
        int key = sc.nextInt();
        // Binary Search
        int result = binarySearch(arr, key);
        if (result == -1) {
            System.out.println("Element not found using Binary Search.");
        }
        else {
            System.out.println("Element found at index using Binary Search: " + result);
        }
        // Linear Search
        int linearResult = linearSearch(arr, key);
        if (linearResult == -1) {
            System.out.println("Element not found using Linear Search.");
        }
        else {
            System.out.println("Element found at index using Linear Search: " + linearResult);
        }
        sc.close();
    }

    public static int binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1;
    }
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}