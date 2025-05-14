import java.util.HashMap;

public class ques_06_two_sum {
    public int[] TwoSum(int[] arr,int target){
        int n=arr.length;
        int[] ans=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<n;i++){
            int moreneeded=target-arr[i];
            if(mpp.containsKey(moreneeded)){
                ans[0]=mpp.get(moreneeded);
                ans[1]=i;
                return ans;
            }
          mpp.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        
    }
}
