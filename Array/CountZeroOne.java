public class CountZeroOne {
    public static int[] countZeroOne(int[] arr)
    {
        int countZero = 0;
        int countOne = 0;
        for(int i=0;i<(arr.length);i++)
        {
            if(arr[i] == 1)
            {
                countOne +=1;
            }else if(arr[i]==0)
            {
                countZero +=1;
            }
        }
        int ans[]={countZero , countOne};
        return ans;

    }
    public static void main(String[] args) {
       int[] arr={1,0,1,1,1,0,1,0,1,1,0,0};
       int[] ans=countZeroOne(arr);
       System.out.println("Number of zero's : "+ans[0]);
       System.out.println("Number of One's : "+ans[1]);
       
        
    }
}
