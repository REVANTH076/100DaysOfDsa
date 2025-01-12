
import java.util.*;
public class subSetSum02{
    
    public static List<List<Integer>> combinationSum2(int[] candidates) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        Arrays.sort(candidates); // Sorting to handle duplicates
        findCombination(candidates,  ans, sub, 0);
        return ans;
    }

    private static  void findCombination(int[] candidates,  List<List<Integer>> ans, List<Integer> sub, int index) {
        // Base condition: if target becomes 0, add the subset to the result
        ans.add(new ArrayList<>(sub));

        for (int i = index; i < candidates.length; i++) {
            // Skip duplicates
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }


            // Include the current element
            sub.add(candidates[i]);
            findCombination(candidates,  ans, sub, i + 1); // Move to the next index
            // Backtrack: remove the last added element
            sub.remove(sub.size() - 1);
        }
    }

    public static void main(String[] args) {
        
        int[] candidates = {0};
        System.out.println(combinationSum2(candidates));
        
    }
}


