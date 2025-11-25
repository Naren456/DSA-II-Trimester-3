

public class CountBits {
    public static  int solve(int A) {
        int mod  = 1000000007;
     if(A == 0){
         return 0;
     }
     long x = largestPoweOf2inrange(A);
     long BitsBefore_x = (x *(1 << (x-1)))%mod; // x*2^(x-1)
     long After_x =  (A - (1 << x) + 1)%mod; // n-2^(x)+1
     int rest = (A - (1 << x))%mod;// n- 2(x)
     long ans = (BitsBefore_x%mod+ After_x%mod + solve(rest)%mod)%mod;
    return (int)ans%mod;
    }

    public static long largestPoweOf2inrange(int n){
        long x = 0;
        while((1 << x)<=n){
            x++;
        }
       return x-1;
    }  
}
