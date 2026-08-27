public class BinarySearch 
{
    public static int binarySearch(int[] arr,int key)
    {   
        int size=arr.length;
        int low=0;
        int high=size-1;
        
        for(int i=0;i<size;i++)
        {
            int mid=(low+high)/2;
            if(key==arr[mid])
            {
                return mid;
            }
             if(arr[mid]<key)
            {
                low=mid+1;
            }else
            {
                high=mid-1;
            }
        }
        return -1;

    }
    public static void main(String[] args) 
    {
        int[] arr={2,3,4,5,6,7};
        int key=2;
       int result =  binarySearch( arr, key);
       if(result == -1)
       {
             System.out.println("Not found");
       } else
        {
            System.out.println("Found at index: " + result);
        }
        
    }
}