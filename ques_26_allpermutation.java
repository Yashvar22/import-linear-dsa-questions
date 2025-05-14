import java.util.*;

public class ques_26_allpermutation {
    public List<List<Integer>> permute(int[] arr){
        List<List<Integer>> ans=new ArrayList<>();
        boolean[] freq=new boolean[arr.length];
        helper(arr,ans,new ArrayList<>(),freq);
        return ans;
    }
    private void helper(int[] arr, List<List<Integer>> ans,List<Integer> ds,boolean[] freq){
        if(ds.size()==arr.length){
            ans.add(new ArrayList<>(ds));
        }
        for(int i=0;i<arr.length;i++){
            if(!freq[i]){
                freq[i]=true;
                ds.add(arr[i]);
                helper(arr, ans, ds, freq);
                ds.remove(ds.size()-1);
                freq[i]=false;
            }
        }
        
    }
    public static void main(String[] args) {
        
    }
}
