public class MaximumElement {
    public static int getMaxElement(int[] arr)
    {
        int max= arr[0];
        for(int i=0; i<(arr.length);i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
      int[] arr={3,4,5,6,7,8,9,10,50};
      System.out.println("Maximun element is :"+ getMaxElement(arr) );
        
    }
}