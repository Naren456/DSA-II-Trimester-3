import java.util.Scanner;
import java.*;
public class RemoveString {
    public Stack<Chararcter> removeDuplicates(String str ,int i){
          if(i==str.length()-1){
            Stack<Chararcter>  st = new Stack<>();
            Stack.push(str.charAt(i));
            return st;
          };
         Stack<Chararcter> Ans  =  removeDuplicates(str, i++);
         if(Ans.peek()==str.charAt(i)){
            Ans.pop();
         }
         else{
            Ans.push(str.charAt(i));
         }
    }
    public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
             String str = sc.next();
             Stack<Chararcter> = removeDuplicates(str,0); 
            }
}