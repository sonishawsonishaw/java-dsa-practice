
public class InsertionSort
{
    public static void insertionSort(int arr[],int n)
    {
        int j,i,temp;
        for( i=1;i<n;i++)
        {
            temp=arr[i];
            j=i-1;
            while(j>=0 && arr[j]>temp)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
            
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
        System.out.println("Before sorting : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
        insertionSort(arr,n);
        System.out.println("After sorting : ");
        printArray(arr,n);
    }
}