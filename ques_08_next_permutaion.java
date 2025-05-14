import java.util.Collection;
import java.util.Collections;

public class ques_08_next_permutaion {
    public static int[] nextPermutation(int[] arr){
        int n=arr.length;
        int idx=-1;
      // find break point
      for(int i=n-2;i>=0;i++){
        if(arr[i]<arr[i+1]){
            idx=i;
            break;
        }

      }
      if(idx==-1){
        reverse(arr, 0, n-1);
        return arr;
      }
      for(int i=n-1;i>idx;i--){
         if(arr[i]>arr[idx]){
            swap(arr,i,idx);
            break;
         }
      }
      reverse(arr,idx+1,n-1);
      return arr;
    }
    static void swap(int[] arr,int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    static void reverse(int[] arr,int i,int j){
        while(i<=j){
            swap(arr, i, j);
            i++;
            j--;

        }
    }
    public static void main(String[] args) {
        
    }
}
