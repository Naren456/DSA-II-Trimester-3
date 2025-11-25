
public class SingleNumberII {
  public static void main(String[] args) {
    public static int singleNumber(int[] A) {
      int ans =0;
      for (int i=0;i<32;i++){
          int count=0;
          for (int j=0;j<A.length;j++){
              if(CheckBit(A[j],i)){
                  count++;
              }
          }
          if(count%3>0){
              ans = SetBit(ans,i);
          }
      }
      return ans;

  }
  public static boolean CheckBit(int num ,int i){
   if((num&(1<<i))>0){
        return true;
      }
      return false;
}
  public static int SetBit(int num,int i){
      return (num | (1<<i));
  }
  }    
}
