public class ques_04_maxi_subarray_k_size {
    public int maxSubarray(int[] arr,int k){
        int n=arr.length;
        int l=0;
        int r=k-1;
        int sum=0;
        while(l<k){
            sum+=arr[l];
        }
        int maxi=sum;
        while(r<n){
            sum=sum-arr[l];
            l++;
            r++;
            sum=sum+arr[r];
            maxi=Math.max(maxi,sum);
        }
        return maxi;
    }
    public static void main(String[] args) {
        
    }
}
