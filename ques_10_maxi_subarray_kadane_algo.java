public class ques_10_maxi_subarray_kadane_algo {
    public static int maximumSun(int[] arr){
        int maxi=0;
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            maxi=Math.max(maxi,sum);
            if(sum<0){
                sum=0;
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        
    }

}
