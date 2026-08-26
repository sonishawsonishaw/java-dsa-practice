import java.util.*;

public class Multiply {
    public static int[] multiplyBy10(int[] arr)
    {
        int size=arr.length;
        int[] newArr=new int[size];
        for(int i=0;i<size;i++)
        {
            int element=arr[i];
            newArr[i]= element*10;

        }
        return newArr;
    }
    public static void main(String[] args) {
       int[] arr={3,4,5,6};
       int ans[]=multiplyBy10(arr);
       System.out.print("Updated Array is : ");
       for(int i : ans)
       {
        System.out.print(i + " ");
       }
        
    }
}