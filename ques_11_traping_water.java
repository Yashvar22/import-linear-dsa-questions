public class ques_11_traping_water {
    public static int trappedWater(int[] arr){
        int n=arr.length;
        int l=0;
        int r=n-1;
        int leftmax=0;
        int rightmax=0;
        int res=0;
        while(l<=r){
            if(arr[l]<=arr[r]){
              if(leftmax<=arr[l]){
                leftmax=arr[l];
              }
              else{
                res+=leftmax-arr[l];
              }
            }
            else{
                if(rightmax<=arr[r]){
                    rightmax=arr[r];
                  }
                  else{
                    res+=rightmax-arr[r];
                  }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        
    }
}
