
import java.util.Scanner;


public class Hummingdis {
    public static int hammingDistance(int[] A) {
        long ans = 0;
        int mod = 1000000007;
        for (int i = 0; i < 32; i++) {
            long SetBit = 0;
            long UnsetBit = 0;
            for (int j = 0; j < A.length; j++) {
                if (checkBit(A[j], i)) {
                    SetBit++;
                } else {
                    UnsetBit++;
                }
            }
            ans = (ans + UnsetBit * SetBit) % mod;
        }
        return (int) ans * 2 % mod;
    }

    public static boolean checkBit(int num, int i) {
        if ((num & (1 << i)) != 0) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i=0;i<n;i++){
            A[i] = sc.nextInt();
        }
        System.out.println(hammingDistance(A));
    }
}
