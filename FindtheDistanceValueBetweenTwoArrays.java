import java.util.Arrays;

public class  FindtheDistanceValueBetweenTwoArrays {

    public static int solution(int[] arr1, int[] arr2, int d){
        Arrays.sort(arr2);
        int distance = arr1.length;
        
        for (int num : arr1) {
            int start = 0;
            int end = arr2.length -1;
            //binary search
            while(start<=end){
                int mid = start + (end - start) /2;
                if(Math.abs(num-arr2[mid]) <= d){
                    distance -= 1;
                    break;
                } else if(arr2[mid] > num){
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            }
        }
        return distance;
    }
}
