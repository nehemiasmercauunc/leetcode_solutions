import java.util.Arrays;

public class PeekIndexMountain {
    public static int solution(int[] arr){
        System.out.println(Arrays.toString(arr));
        int r = arr.length-1;
        int l = 0;
        
        while(l<r){
            int mid = l + (r-l)/2;
            if(arr[mid]<arr[mid+1]){
                l = mid+1;
            } else {
                r = mid;
            }
        }
        
        return r;
    }
}
