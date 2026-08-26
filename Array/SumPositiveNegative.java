public class SumPositiveNegative {
    public static int[] sumPositiveNegative(int arr[])
    {
        int posSum=0;
        int negSum=0;
        for(int i=0;i<(arr.length);i++)
        {
            if(arr[i]>0)
            {
                posSum += arr[i];
                
            }else 
            {
                negSum += arr[i];
                
            }
        }
            int ans[]={posSum , negSum };
            return ans;

    }
    public static void main(String[] args) {
       int[] arr={1,2,3,-1,-2,-3,-4};
       int ans[] = sumPositiveNegative(arr);
        System.out.println("Positive Sum = " + ans[0]);
        System.out.println("Negative Sum = " + ans[1]);
        
    }
}