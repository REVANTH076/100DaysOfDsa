import java.util.*;

public class palindromePartition {
        public static  List<List<String>> partition(String s){
        List<List<String>> res = new ArrayList<>();
        List<String> sub = new ArrayList<>();
        findPartition(s,res,sub,0);
        return res;
    }
    private static void findPartition(String s , List<List<String>> res , List<String> sub,int startIndex){
        if(startIndex == s.length()){
            res.add(new ArrayList<>(sub));
            return;
        }

        for(int i = startIndex ;i<s.length();i++){
            if(isPalindrome(s.substring(startIndex,i+1))){
                sub.add(s.substring(startIndex , i+1));
                findPartition(s, res, sub, i+1);
                sub.remove(sub.size()-1);
            }
        }

    }

    private static boolean isPalindrome(String s){
        int start =0 , end = s.length() -1;
        while (start<=end) {
            if(s.charAt(start++) != s.charAt(end--)){
                return false;
            }
            
        }
        return true;
    }


    public static void main(String[] args) {
        String str = "aabb";
        
        System.out.println(partition(str));
    }
}
