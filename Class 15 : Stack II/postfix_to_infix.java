
import java.util.Scanner;
import java.util.Stack;

public class postfix_to_infix {
    public static  String postfixtoinfix(String str){
       Stack<String> st = new Stack<>();
       for(int i=0 ;i<str.length();i++){
        char ch = str.charAt(i); 
        if( (ch>='a' && ch<='z' ) || (ch >= 'A' && ch <= 'Z')){
            st.push(String.valueOf(ch));
        }
        else{
              String s2 = st.pop();
              String s1 = st.pop(); 
              String cur  =  '('+ s1 + ch +s2 + ')';
              st.push(cur);
        }
    }
        return  st.pop();
       }

       public static  String PrefixToInfix(String str){
        Stack<String> st = new Stack<>();
        for(int i=str.length()-1 ;i>=0;i--){
         char ch = str.charAt(i); 
         if( (ch>='a' && ch<='z' ) || (ch >= 'A' && ch <= 'Z')){
             st.push(String.valueOf(ch));
         }
         else{
               String s1 = st.pop();
               String s2 = st.pop(); 
               String cur  =  '('+ s1 + ch +s2 + ')';
               st.push(cur);
         }
     }
         return  st.pop();
        }

        public static  String PostfixToPrefix(String str){
            Stack<String> st = new Stack<>();
            for(int i=0 ;i<str.length();i++){
             char ch = str.charAt(i); 
             if( (ch>='a' && ch<='z' ) || (ch >= 'A' && ch <= 'Z')){
                 st.push(String.valueOf(ch));
             }
             else{
                   String s2 = st.pop();
                   String s1 = st.pop(); 
                   String cur  =   ch + s1 +s2  ;
                   st.push(cur);
             }
         }
             return  st.pop();
            }

            public static  String PrefixToPostfix(String str){
                Stack<String> st = new Stack<>();
                for(int i=str.length()-1 ;i>=0;i--){
                 char ch = str.charAt(i); 
                 if( (ch>='a' && ch<='z' ) || (ch >= 'A' && ch <= 'Z')){
                     st.push(String.valueOf(ch));
                 }
                 else{
                       String s2 = st.pop();
                       String s1 = st.pop(); 
                       String cur  =   s2 + s1+ ch;
                       st.push(cur);
                 }
             }
                 return  st.pop();
                }
         
     
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str  =  sc.nextLine();
        // System.out.println(PrefixToInfix(str));
        // System.out.println(PostfixToPrefix(str));
        System.out.println(PrefixToPostfix(str));
    }
}
