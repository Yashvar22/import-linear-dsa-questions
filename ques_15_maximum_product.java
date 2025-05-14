public class ques_15_maximum_product {
    public static int maxiProducSubarray(int[] arr){
        int n=arr.length;
        int suff=1;
        int pre=1;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
   
            if(pre==0) pre=1;
            if(suff==0) suff=1;
              pre=pre*arr[i];
            suff=suff*arr[n-i-1];
        
            ans=Math.max(ans,Math.max(pre,suff));
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
