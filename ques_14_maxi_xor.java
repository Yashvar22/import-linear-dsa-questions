public class ques_14_maxi_xor {

    public static int Maxixor(int[] arr){
        int maxi=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                maxi=Math.max(maxi,arr[i]^arr[j]);
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        
    }
}
