import java.util.*;

public class ques_29_maximum_freq {

    public static int maximumFreq(int[] arr){
        int n=arr.length;
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<n;i++){
            mpp.put(arr[i],mpp.getOrDefault(arr[i], 0)+1);
        }
        int maxEle=arr[0];
        int maxfre=-1;
        for(Map.Entry<Integer,Integer> entry:mpp.entrySet()){
            int key=entry.getKey();
            int values=entry.getValue();
            if(values>maxfre){
                maxfre=values;
                maxfre=key;
            }
        }
        return maxEle;
    }
    public static void main(String[] args) {
        
    }
}
