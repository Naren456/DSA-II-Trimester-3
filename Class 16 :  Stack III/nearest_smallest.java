import java.util.*;

public class nearest_smallest {
    public static int[] nearest_smallest_finder(int[] nums){
        Stack<Integer> st = new Stack<>();
        Stack<Integer> in = new Stack<>();
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            while( !st.empty() && nums[st.peek()]>=nums[i]){
                st.pop();
             }

            if(st.empty()){
                ans[i] = -1;
            }
            
            else{
                ans[i] = st.peek();
            }
          
              
        
           st.push(i);

        }
        return ans;
    }
    public static void printArray(int[] A){
         for (int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
         }
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] A =  new int[n];
      for (int i=0;i<n;i++){
        A[i] =  sc.nextInt();
      }
      int [] ans  = nearest_smallest_finder(A);
      printArray(ans);
    }
}
