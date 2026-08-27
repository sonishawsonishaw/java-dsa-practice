public class RightShiftArrayByOne
{
    public static void rightShiftByOne(int[] arr) 
    {
        int size = arr.length;
        int temp=arr[size-1];
       for(int i=size-1;i>0;i--)
       {
            arr[i]=arr[i-1];
       }
       arr[0]=temp;
       for(int k:arr)
       {
        System.out.print(k +" ");
       }
    }
    public static void main(String[] args) 
    {
       int[] arr={1,2,3,4,5};
        rightShiftByOne(arr);      
    }
}