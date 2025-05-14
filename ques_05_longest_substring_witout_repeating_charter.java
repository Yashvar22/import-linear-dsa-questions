import java.util.HashMap;

public class ques_05_longest_substring_witout_repeating_charter {
    public int longest_substring(String s){
       int l=0;
       int r=0;
       int maxi=0;
       HashMap<Character,Integer> mpp=new HashMap<>();
       while(r<s.length()){
        char ch=s.charAt(r);
        if(mpp.containsKey(ch) && mpp.get(ch)>=l){
            l=mpp.get(ch)+1;
        }
         mpp.put( ch,r);
         maxi=Math.max(maxi,r-l+1);
         r++;
       }
       return maxi;
    }
    public static void main(String[] args) {
        
    }
}
