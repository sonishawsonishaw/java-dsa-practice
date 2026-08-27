public class Reverse 
{
    public static void reverseArr(int[] arr)
    {   int size = arr.length;
        int j= size -1;
        int i=0;
        while(i<=j)
        {
            int temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int ans:arr)
        {
            System.out.print(ans +" ");
        }
       
    }
    public static void main(String[] args) 
    {
        int[] arr={2,3,4,5,7,8,3,4,5,6,7,8,9,1,6};
        reverseArr( arr);
        
        
    }
}