
    
import java.util.*;
class SubSetSum1{
    public static List<Integer> subSet(int[] arr){
        List<Integer> sub = new ArrayList<>();
        // List<Integer> ans = new ArrayList<>();
        findSubSetSum(arr,sub,0,0);
        Collections.sort(sub);
        return sub;
    }

    public static void findSubSetSum(int[] arr , List<Integer> sub,int index,int sum){
        if(index == arr.length){
            sub.add(sum);
            return;
        }

        
        // sub.add(arr[index]);
        findSubSetSum(arr, sub,  index+1 , sum+arr[index]);
        // sub.remove();
        findSubSetSum(arr, sub, index+1 , sum);
        
        
    }
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        
       System.out.println(subSet(arr)); 
    }
}


