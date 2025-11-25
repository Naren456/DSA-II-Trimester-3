import java.lang.*;
import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String reverse_str = Reverse(str);
        System.out.println(reverse_str);
    }

    public static String Reverse(String str){
        char [] charArray = str.toCharArray();
        ReverseArray(charArray,0,charArray.length-1);
        return new String(charArray);
    }

    public static  void ReverseArray(char [] charArray,int left ,int right){
        if(left>right){
            return;
        }
        char temp = charArray[left];
        charArray[left] = charArray[right];
        charArray[right] = temp;

        ReverseArray(charArray,left+1,right-1);
    }
}