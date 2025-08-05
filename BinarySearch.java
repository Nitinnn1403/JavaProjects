import java.util.*;

public class BinarySearch{
    static int binarySearch(int a[], int l, int r, int x)
    {

      	if (r >= l) {
            int m = l + (r - l) / 2;

            if (a[m] == x)
                return m;
            if (a[m] > x)
                return binarySearch(a, l, m - 1, x);
            return binarySearch(a, m + 1, r, x);
        }
        return -1;
    }
    public static void main(String args[])
    {
        int a[] = { 2, 3, 4, 10, 40};
        int n = a.length;
        int x = 4;
      
        int res = binarySearch(a, 0, n - 1, x);

       System.out.println("Element to be searched is : "+ x); 

        if (res == -1)
            System.out.println(
                "Element is not present in array");
        else
            System.out.println("Element is present at index: " + res);
    }
}