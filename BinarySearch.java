public class BinarySearch {
    public static int solution(int[] array, int N) {
        /*
         * array = [-1,0,3,5,9,12] .... N=9
         * 
         */

        int indexL = 0, indexR = array.length-1;

        //ITERAR 
        while(indexR - indexL > 1){
            int middleIndex = (indexL+indexR)/2; //5/2=2 --- //8/2=4
            int valMiddle = array[middleIndex]; //9
            if(valMiddle < N){
                indexL = middleIndex + 1; //l=3, r=5
            } else {
                indexR = middleIndex; //l=0, r=2 || l=3, r=4
            }
        }
        
        if(array[indexL] == N){
            return indexL;
        } else if(array[indexR] == N){
            return indexR;
        } else {
            return -1;
        }
    }

    public static int solutionRecursive(int[] array, int N){
        return binarySearch(array, 0, array.length-1, N);
    }

    static int binarySearch(int arr[], int l, int r, int x){
        if(r >= l){
            int mid = l + (r-l) / 2; // mid=2

            //caso de que este presente al medio del array el N
            if(arr[mid] == x)
                return mid;

            //si el N es menor que el del medio, N solo puede estar en la parte inferior
            if(arr[mid] > x){
                return binarySearch(arr, l, mid-1, x);
            }
            //else
            return binarySearch(arr, mid+1, r, x);

        }

        //Si llega hasta aca, es porque el N no esta en el array
        return -1;
    }
}
