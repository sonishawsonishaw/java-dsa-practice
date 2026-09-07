
import java.util.*;
public class BubbleSort
{
    public static void bubbleSort(int arr[] , int n)
    {
        int i,j,temp;
        boolean flag=false;
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if(flag==false)
            {
                break;
            }
        }
    }
    public static void printArray(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        int[] arr={9,8,76,4,34,2,21,4,45,4,7,89,5};
        int n=arr.length;
        bubbleSort(arr,n);
        System.out.println("After sorting : ");
        printArray(arr,n);
    }
}

