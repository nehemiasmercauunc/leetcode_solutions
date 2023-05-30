import java.util.HashMap;

public class Romans {
    public static int solution(String s){
        /*MCMXCIV ----> 1994 ----> M = 1000, CM = 900, XC = 90 and IV = 4
        suma = 0;
        i=0 --> M
            i+1 = C 
            M < C?
                RESTA
            else
                SUMA
                suma += M --> suma=1000

        i=1 --> C
            i+1 = M 
            C < M?
                RESTA
                suma -= C --> suma =900
            else
                SUMA
        
        i=2 --> M
            i+1 = X 
            M < X?
                RESTA
            else
                SUMA
                suma += M --> suma=1900
        i=6 --> V
            i+1 OUT
        */

        HashMap<String, Integer> romans = new HashMap<String, Integer>();
        romans.put("I", 1);
        romans.put("V", 5);
        romans.put("X", 10);
        romans.put("L", 50);
        romans.put("C", 100);
        romans.put("D", 500);
        romans.put("M", 1000);

        int suma = 0;
        for(int i = 0; i<s.length(); i++){
            int actual = romans.get(String.valueOf(s.charAt(i)));
            if(i+1<s.length()){
                int next = romans.get(String.valueOf(s.charAt(i+1)));
                if(actual < next){//resta
                    suma -= actual;
                } else {//suma
                    suma += actual;
                }
            }
            else {
                suma += actual;
            }
        }
        return suma;

    }

    public static int solution1(String s){
        /*
        MEJORA DEL CODIGO
        */

        HashMap<String, Integer> romans = new HashMap<String, Integer>();
        romans.put("I", 1);
        romans.put("V", 5);
        romans.put("X", 10);
        romans.put("L", 50);
        romans.put("C", 100);
        romans.put("D", 500);
        romans.put("M", 1000);

        int suma = 0;
        for(int i = 0; i<s.length(); i++){
            int actual = romans.get(String.valueOf(s.charAt(i)));
            if(i+1<s.length() && actual < romans.get(String.valueOf(s.charAt(i+1)))){//RESTA
                suma -= actual;
            }
            else {//SUMA
                suma += actual;
            }
        }
        return suma;

    }
}
