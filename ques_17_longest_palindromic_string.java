public class ques_17_longest_palindromic_string {
    public static String Longest(String s){
        int n=s.length();
        int maxlength=0;
        int st=-1;
        int end=-1;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            for(int j=i+1;j<n;j++){
                if(isPalindrome(s,i,j)==true){
                   if(j-i+1>maxlength){
                    maxlength=j-i+1;
                    st=i;
                    end=j;
                   }
                }
            }
        }
            return s.substring(st, end+1);
        }
    public static boolean isPalindrome(String s,int i,int j){
            while(i<j){
                char ch1 = s.charAt(i);
                char ch2 = s.charAt(j);
                if(ch1!=ch2){
                    return false;
                }
                i++;
                j--;
            }
            return true;
        }
    
    
    public static void main(String[] args) {
        
    }
}
