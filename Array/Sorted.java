
public class Sorted {
    static boolean isSorted(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i+1]<arr[i])
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr={2,3,7,4,5,6,7,8};
        if(isSorted(arr))
        {
            System.out.println("True");
        }else
        {
            System.out.println("false");
        }   
        
    }
}