public class ques_07_majority_element {

    //voting alogo
    public static int majorityElement(int[] arr){
        int n=arr.length;
        int cnt=0;
        int el=-1;
        for(int i=0;i<n;i++){
            if(cnt==0){
                cnt++;
                el=arr[i];
            }
            else if(el==arr[i]){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        int cnt2=0;
        for(int i=0;i<n;i++){
            if(el==arr[i]){
                cnt2++;
            }
            if(cnt2>(n/2)){
                return el;
            }
        }
        return -1;
    }
   public static void main(String[] args) {
    
   }
}
