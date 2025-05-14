import java.util.Stack;

public class ques_25_largest_rectangle_histogram {
    public int largestRec(int[] arr){
        int n=arr.length;
        int[] pse=new int[n];
        int [] nse=new int[n];
        Stack<Integer> st=new Stack<>();
        //PSE
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&& arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                pse[i]=-1;
            }
            else{
                pse[i]=st.peek();
            }
            st.push(i);
        }
        st.clear();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty()&& arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                pse[i]=n;
            }
            else{
                pse[i]=st.peek();
            }
            st.push(i);
        }
        int maxA=0;
        for(int i=0;i<n;i++){
            maxA=Math.max(maxA,(nse[i]-pse[i]-1)*n);
        }
        return maxA;
    }
    public static void main(String[] args) {
        
    }
}
