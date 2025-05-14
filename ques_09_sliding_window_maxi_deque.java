import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class ques_09_sliding_window_maxi_deque {
    public static List<Integer> slidindWindowMaxi(int [] arr,int k){
        int n=arr.length;
        List<Integer> ll=new ArrayList<>();
        Deque<Integer> dq=new ArrayDeque<>();

        for(int i=0;i<n;i++){
            if(!dq.isEmpty() && dq.peek()<=i-k){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && arr[dq.peek()]<=arr[i]){
                dq.pollLast();
            }
            dq.offer(i);
            if(i>=k-1){
             ll.add(arr[dq.peek()]);
            }
        }
        return ll;
    }
    public static void main(String[] args) {
        
    }
}
