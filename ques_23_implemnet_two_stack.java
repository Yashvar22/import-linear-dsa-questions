public class ques_23_implemnet_two_stack {
    class twoStack{
        int[] arr;
        int size;
        int top1;
        int top2;
        twoStack(int n){
            arr=new int[n];
            size=n;
            top1=-1;
            top2=size;
        }
      void push1(int x){
        if(top1+1==top2){
           System.out.println("stack full");
        }
        else{
            top1++;
            arr[top1]=x;
        }
      }
      void push2(int x){
        if(top2-1==top1){
           System.out.println("stack full");
        }
        else{
            top2--;
            arr[top2]=x;
        }
      }
      int pop1(){
        if(top1==-1){
            System.out.println("stack is empty");
            return -1;
        }
        int val=arr[top1];
        top1--;
        return val;
      }
      int pop2(){
        if(top1==size){
            System.out.println("stack is empty");
            return -1;
        }
        int val=arr[top2];
        top2++;
        return val;
      }
    }
    public static void main(String[] args) {
        
    }
}
