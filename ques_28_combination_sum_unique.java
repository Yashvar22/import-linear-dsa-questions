import java.util.*;

public class ques_28_combination_sum_unique {
    public static List<List<Integer>> Combination(int[] arr,int target){
        List<List<Integer>> ans=new ArrayList<>();
        helper(arr,ans,new ArrayList<>(),0,target);
        return ans;
    }

    private static void helper(int[] arr,List<List<Integer>>ans,List<Integer> ds,int idx,int target){
        if(target==0){
            ans.add(new ArrayList<>(ds));
            return ;
        }
        for(int i=idx;i<arr.length;i++){
           if(i>idx && arr[i]==arr[i-1]) continue;
           if(arr[i]>target){
            break;
           }
           ds.add(arr[i]);
           helper(arr,ans,ds,idx+1,target-arr[i]);
           ds.remove(ds.size()-1); 
        }
    }
    public static void main(String[] args) {
        
    }
}
