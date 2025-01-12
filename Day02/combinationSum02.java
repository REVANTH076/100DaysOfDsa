
import java.util.*;
public class combinationSum02 {
    
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        Arrays.sort(candidates); // Sorting to handle duplicates
        findCombination(candidates, target, ans, sub, 0);
        return ans;
    }

    private static  void findCombination(int[] candidates, int target, List<List<Integer>> ans, List<Integer> sub, int index) {
        // Base condition: if target becomes 0, add the subset to the result
        if (target == 0) {
            ans.add(new ArrayList<>(sub));
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            // Skip duplicates
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }

            // Break if the current element exceeds the target
            if (candidates[i] > target) {
                break;
            }

            // Include the current element
            sub.add(candidates[i]);
            findCombination(candidates, target - candidates[i], ans, sub, i + 1); // Move to the next index
            // Backtrack: remove the last added element
            sub.remove(sub.size() - 1);
        }
    }

    public static void main(String[] args) {
        
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        System.out.println(combinationSum2(candidates, target));
        
    }
}


