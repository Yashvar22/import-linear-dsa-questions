public class ques_13_power_of_two {
    public static boolean isPower(int n){
        return (n>0) && ((n & (n-1))==0);
    }
    public static void main(String[] args) {
        
    }
}
