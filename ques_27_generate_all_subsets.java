import java.util.*;

public class ques_27_generate_all_subsets {
    public static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> ans=new ArrayList<>();
        helper(arr,ans,new ArrayList<>(),0);
        // for(List<Integer> sub:ans){
        //     System.out.println(sub);
        // }
        return ans;
    }
    public static void helper(int[] arr, List<List<Integer>> ans,List<Integer> ds,int idx){
        if(idx==arr.length){
            ans.add(new ArrayList<>(ds));
        }
        ds.add(arr[idx]);
        helper(arr,ans,ds,idx+1);//tick wlaa
        ds.remove(ds.size()-1);
        helper(arr,ans,ds,idx+1);//untick wala
    }
    public static void main(String[] args) {
        
    }
}
