import java.util.Arrays;
public class BinarySearchRange {

    public static void main(String[] args) {
       
       byte byteArr[]={105,7,7,5,43,3,5,45};
       Arrays.sort(byteArr);
       byte byteKey = 22;
       System.out.println(byteKey + " found at index = " + Arrays.binarySearch(byteArr,2,4,byteKey));
        
        char charArr[]={'a','h','i','g','o'};
        Arrays.sort(charArr);
        char charKey='c';
        System.out.println(charKey + " found at index : " + Arrays.binarySearch(charArr,1,4,charKey));
        
       float floatArr[]={2.4f,4,5f,7.8f,1.2f,1.3f};
       Arrays.sort(floatArr);
       float floatKey = 2.1f;
       System.out.println(floatKey + " found at index : " + Arrays.binarySearch(floatArr,1,3,floatKey));
    }
}


























