public class Average
{
    public  static double getAverage(int arr[])
    {
         int size=arr.length;
        double sum=0;
        for(int i: arr)
        {
            sum += i;
        }
         double avg=(sum/size);
        return avg;
    }
    public static void main(String args[])
    {
        int[] arr ={3,6,9,7};
        System.out.println("Average : "+ getAverage(arr));
       
       
    }
}
