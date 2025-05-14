import java.util.Stack;

public class ques_24_next_greater_element {
    public static int[] NGE(int[] arr){
        int n=arr.length;
        int[] nge=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=2*n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i%n]){
                st.pop();
            }
            if (i < n) {
                if (st.isEmpty() == false) nge[i] = st.peek();
                else nge[i] = -1;
            }

            st.push(arr[i % n]);
        }
        
        return nge;
    }
    public static void main(String[] args) {
        
    }
}
