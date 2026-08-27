import java.util.*;
public class FindMode {
    static void findMode(int[] arr)
    {
        HashMap<Integer ,Integer> frequency=new HashMap<>();
        for(int num:arr)
        {
            frequency.put(num,frequency.getOrDefault(num,0)+1);
        }
        for(int i:frequency.keySet())
        {
            System.out.println(i + " -> "+ frequency.get(i));
        }
    }
    public static void main(String[] args) {
       int[] arr={2,3,4,5,6,5,4,3,2,4,6,4};
        findMode(arr);   
    }
}