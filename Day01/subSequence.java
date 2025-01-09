import java.util.*;
public class subSequence {
    public static ArrayList<ArrayList<Integer>> subsets(int[] nums , int index , ArrayList<Integer> sub ,ArrayList<ArrayList<Integer>> res) {
        int n = nums.length;
        if(index == n){
            res.add(new ArrayList<>(sub));
            return res;
        }

        subsets(nums, index+1, sub, res);
        sub.add(nums[index]);
        subsets(nums, index+1, sub, res);
        sub.remove(sub.size()-1);
        
        return res;
    }
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1,2,3,4));
        int[] nums = {1,2,3};
        ArrayList<Integer> sub = new ArrayList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        System.out.println((subsets(nums ,0, sub ,res)));
        

    }
}
