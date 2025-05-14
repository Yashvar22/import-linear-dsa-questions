public class ques_03_split_arr {
    public boolean pivot(int[] arr){
        int n=arr.length;
        int total=0;
        for(int i=0;i<n;i++){
        total+=arr[i];
        }
        int psum=0;
       for(int i=0;i<n;i++){
        psum+=arr[i];
        if(psum==total-psum){
            return true;
        }
       }
       return false;
    }
    public static void main(String[] args) {
        
    }
}
