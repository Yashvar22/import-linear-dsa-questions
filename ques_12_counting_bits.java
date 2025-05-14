public class ques_12_counting_bits {
    public static int[] count1bits(int n){
        int cnt=0;
        int[] ans=new int[n+1];
       for(int i=0;i<=n;i++){
        int num=i;
        while(num!=0){
            cnt+=num%2;
            num=  num/2;
        }
        ans[i]=cnt;
       }
       return ans;
    }
    public static void main(String[] args) {
        
    }
}
