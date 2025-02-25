
import java.util.Scanner;


public class MaxAnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [] A = new int[num];
        for (int i=0;i<num;i++){
            A[i] = sc.nextInt();
        }
          System.out.println(MaxPair(A));
    }   
    public static  int MaxPair(int[] A){
        int ans = 0;
        boolean[] B = new boolean[A.length];
      for (int i=31;i>=0;i--){
          int count = 0;
          for (int j=0;j<A.length;j++){
              if(CheckBit(A[j],i)  && (!B[j]) ){
                  count++;
              }
          }
          if(count>=2){
              ans = SetBit(ans,i);
          
              for (int j=0 ;j<A.length;j++){
                  if(!CheckBit(A[j],i)){
                      B[j] = true;
                  }
                }
            }
        }
        return  ans;
    }
    public static boolean CheckBit(int num ,int i){
        if((num&(1<<i))>0){
            return true;
        }
        return false;
    }
    public static int SetBit(int num ,int i){
        return (num|(1<<i));
    } 
}
