public class FirstUnsortedElement 
{
    public static int findFirstUnsortedElement(int[] arr)
    {
        int size=(arr.length)-1;
        int element =0;
         for(int i=0;i<size;i++)
         {
            if(arr[i]+1 <arr[i])
            {
             element = arr[i]+1;
            }
         }
         return element;
    }
    public static void main(String[] args) 
    {
        int[] arr={2,3,4,5,5,6,7};
        System.out.println(findFirstUnsortedElement(arr));

        
    }
}