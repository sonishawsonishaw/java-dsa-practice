import java.util.*;
public class ArrayBinarySearch
{
    public static void main(String args[])
    {
        // Example integer array
        int[] arr={10,20,30,40,50,60};
        // Sort the array before searching
        Arrays.sort(arr);
        // Perform binary search for the specified values
        System.out.println("Searching for 20 in arr: " + Arrays.binarySearch(arr,20));
        System.out.println("Searching for 40 in arr: "+ Arrays.binarySearch(arr,40));
        System.out.println("Searching for 50 in arr : " + Arrays.binarySearch(arr,50));

    }
}