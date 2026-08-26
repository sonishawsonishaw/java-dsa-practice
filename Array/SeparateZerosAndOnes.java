public class SeparateZerosAndOnes
{
    public static void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
    public static void separate(int arr[])
    {
        int i=0;
        int j=arr.length-1;
        while(i<=j)
        {
            if(arr[i]==1)
            {
                 swap(arr,i,j);
                j--;
            }else
            {    
               i++;
            }
           
        }

    }
    public static void main(String[] args )
    {
        int[] arr={0,1,0,1,0,1,0,1,0};
       separate(arr);
       for(int r:arr)
       {
        System.out.print(r + " ");
       }

    }
}