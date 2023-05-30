public class ValidPerfectSquare {
    public static boolean solution(int num){
        //NO FUNCA X LA MULTIPLICACION. EN PYTHON ANDA JOYA
        if(num < 2){
            return true;
        }
        
        int low = 1;
        int high= num;

        while(low<high){
            System.out.println("l:" + low + ". h: "+ high);
            int mid = low + (high - low)/2;
            System.out.println("mid: " + mid);
            long mult = ((long)(mid*mid) > Integer.MAX_VALUE) ? Integer.MAX_VALUE +1 : (long)(mid*mid);
            System.out.println("mult: " + mult);
            if(mult == Integer.MAX_VALUE){
                return false;
            }
            if(mult > num){
                high = mid-1;
            } else if(mult < num) {
                low = mid+1;
            } else {
                return true;
            }

        }
        return false;
    }
}
