import  java.util.*;
public  class SingleNumberIII {
    public static  int[] solve(int[] A) {
        if(A.length<=2){
            return A;
        }
        int xor = Xor(A);
        int P= getSetBitPos(xor);
        int [] Ans  = GetTwoNumber(A,P);
        Arrays.sort(Ans);
        return Ans;
        }
         //Step 1 : Take xor of All elements //
        public static int Xor(int[] A){
        int num = 0;
        for(int i=0;i<A.length;i++){
            num = num^A[i];
        }
        return num;
     } 
    
     //Step 2 : Find SetBit position in  Xor //
    public static int getSetBitPos(int num){
             for (int i=0;i<32;i++){
                if(CheckBit(num,i))
                   return i;
             }
             return -1;
    }
    //Step 3 : Use SetBitPOsiton to segregate the numbers //
    public static int[] GetTwoNumber(int[] A,int P){
        int ans1 = 0;
        int ans2 = 0;
        for (int i=0;i<A.length;i++){
            if(CheckBit(A[i], P)){
                ans1 = ans1^A[i];
            }
            else{
                ans2 = ans2^A[i];
            }
        }
         int [] Ans = new int [2];
        Ans[0] =ans2;
        Ans[1] =ans1;
        return Ans;
    }
    
        //CheckBit if it is set or unset //
        public static boolean CheckBit(int num ,int i){
              if((num & (1<<i))>0){
                return true;
              }
              return false;
        }
    
        // SetBit to 1 //
        public static int SetBit(int num ,int i){
            return (num|(1<<i));
        }
    
}
