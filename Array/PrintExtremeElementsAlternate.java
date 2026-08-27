import java.util.*;
public class PrintExtremeElementsAlternate 
{
    public static void  printEtremeAlternate(int[] arr)
    {
        int size =arr.length;
        int i=0;
        int j=size-1;
        while(i<=j)
        {
            if(i==j)
            {
                System.out.print(arr[i] + " ");
                return;
            }else
            {
                System.out.print(arr[i] + " ");
                i++;
                System.out.print(arr[j] + " ");
                j--;
            }
        }
    } 
    public static void main(String[] args) 
    {
        // int[] arr={1,2,3,4,5,6};
        // System.out.println("Actual Arrays is : " + Arrays.toString(arr));
        // printEtremeAlternate( arr);
       int[] ans={1,2,3,4,5};
       System.out.println("Actual Arrays is : " + Arrays.toString(ans));
        printEtremeAlternate(ans);
        
    }
}