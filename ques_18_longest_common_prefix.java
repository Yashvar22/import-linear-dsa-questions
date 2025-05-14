import java.util.Arrays;

public class ques_18_longest_common_prefix {
    public static String LongestPrefix(String[] str){
        StringBuilder res=new StringBuilder();
           Arrays.sort(str);
           String first=str[0];
           String second=str[str.length-1];
           for(int i=0;i<str.length;i++){
            if(first.charAt(i)!=second.charAt(i)){
                break;
            }
            res.append(first.charAt((i)));
           }
           return res.toString();
    }
    public static void main(String[] args) {
        
    }
}
