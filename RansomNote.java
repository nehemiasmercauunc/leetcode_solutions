import java.util.HashMap;
public class RansomNote {
    
    public static boolean solution(String ransomNote, String magazine){
        HashMap<String, Integer> ransom = new HashMap<String, Integer>();
        for(int i =0; i < magazine.length(); i++){
            String letter =  String.valueOf(magazine.charAt(i));
            if(ransom.containsKey(letter)){
                ransom.put(letter, ransom.get(letter)+1);
            } else {
                ransom.put(letter, 1);
            }
        }

        for(int i = 0; i < ransomNote.length(); i++){
            String letter = String.valueOf(ransomNote.charAt(i));
            if(ransom.containsKey(letter)){
                if(ransom.get(letter) > 0){
                    ransom.put(letter, ransom.get(letter)-1);
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        return true;
    }

    public static boolean solution1(String ransomNote, String magazine){
        int arr[]=new int[26];
        for(char ch:magazine.toCharArray()){
            arr[ch-'a']++;
            System.out.println(ch-'a');
        }
            
        
        for(char ch:ransomNote.toCharArray()){
            if(arr[ch-'a']==0)return false;
            arr[ch-'a']--;
    }
        return true;
    }
}