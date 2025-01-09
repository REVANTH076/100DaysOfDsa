

import java.util.*;

public class subSequenceSum {
    public static int sumOfSUb(int[] nums ,int sum, int target,List<Integer> sub,int index,int count){
        if(index == nums.length){
            if(sum == target){
                count++;
            }
            return count;
        }

        sub.add(nums[index]);
        sum+=nums[index];
        count = sumOfSUb(nums, sum, target, sub, index+1,count);
        
        sum -= sub.get(sub.size() -1);
        sub.remove(sub.size() -1);
        count = sumOfSUb(nums, sum, target, sub, index+1,count);
        
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 10, 6, 8};
        int target = 10;
        int c=0;
        List<Integer> sub = new ArrayList<>();
        System.out.println(sumOfSUb(arr,0,target,sub,0,c));
    }
}

