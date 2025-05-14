public class ques_22_palindrome_number {
    public static boolean palindromeNum(int x){
    if (x < 0 || (x % 10 == 0 && x != 0)) {
        return false;
    }
    
    int original = x; // Store the original value of x
    int reversed = 0;
    
    // Reverse the number
    while (x > 0) {
        reversed = reversed * 10 + (x % 10);
        x = x / 10;
    }
    
    // Check if the original number equals the reversed number
    return reversed == original;
}
    public static void main(String[] args) {
        
    }
}
