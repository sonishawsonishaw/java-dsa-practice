import java.util.*;
public class secondLargestElement {
    public static int getsecondLargestElement(int arr[])
    {
        int largest=arr[0];
        int secondLargest=-1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                secondLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondLargest && arr[i] != largest)
            {
                secondLargest=arr[i];
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) 
    {
       int[] arr={4,5,2,4,7,8,55,88,33,99};
       int result = getsecondLargestElement(arr);
        System.out.println(result);
    }    
}