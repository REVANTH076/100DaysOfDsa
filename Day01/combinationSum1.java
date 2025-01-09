// package Day01;

    import java.util.*;

public class combinationSum1 {
    static void  subsets(int []arr,int index, ArrayList<Integer> subset,ArrayList<ArrayList<Integer>> res,int n,int target){
        if(index == n){
            if(target==0){
                res.add(new ArrayList<>(subset));
            }
            
            return ;
        }
        if(arr[index]<=target){
            subset.add(arr[index]);
            subsets(arr,index,subset,res,n,target-arr[index]);//change done
            subset.remove(subset.size() -1);
        }
        

        subsets(arr,index+1,subset,res,n,target);
        
    }

    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        int n = arr.length;
        ArrayList<Integer> subset= new ArrayList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        subsets(arr,0,subset,res,n,7);
        System.out.println(res);


    }
}

