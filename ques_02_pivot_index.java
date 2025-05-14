public class ques_02_pivot_index {

    public int pivot(int[] arr){
        int n=arr.length;
        int total=0;
        for(int i=0;i<n;i++){
        total+=arr[i];
        }
       int lsum=0;
       for(int i=0;i<n;i++){
          int rsum=total-lsum-arr[i];
          if(rsum==lsum){
            return i;
          }
          lsum=lsum+arr[i];
       }
       return -1;
    }
    public static void main(String[] args) {
        
    }
}
