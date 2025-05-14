class ques_01_Range_sum{
    public static int RangeSum(int[] arr,int l,int r){
        if(l==0){
            return arr[r];
        }
        return arr[r]-arr[l-1];
    }
    public static int[] prefix(int[] arr){
        int n=arr.length;
        int[] prefix=new int[n];
        prefix[0]=arr[0];
        for(int i=1;i<n;i++){
         prefix[i]=prefix[i-1]+arr[i];
        }
        return prefix;
    }
    public static void main(String[] args) {
        int[] arr={3,5,2,6,1};
       int l=1;
       int r=3;
       int[] pre=prefix(arr);
       int sum=RangeSum(pre,l,r);
       System.out.println(sum);
    }
}