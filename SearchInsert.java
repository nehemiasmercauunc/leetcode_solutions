public class SearchInsert {
            
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
            System.out.println("l: " + l + ". r: " + r);
            //Si llega hasta aca, es porque el N no esta en el array
            return l;
        }
    
    
}
