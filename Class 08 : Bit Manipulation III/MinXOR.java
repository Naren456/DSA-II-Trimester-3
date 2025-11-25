
import java.util.Arrays;
import java.util.Scanner;
public class MinXOR{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [] A = new int[num];
        for (int i=0;i<num;i++){
            A[i] = sc.nextInt();
        }
        System.out.println(MinXOR(A));
    }
    public static int MinXOR(int[] A){
        Arrays.sort(A);
        int i=0;
        int j=1;
        int min = Integer.MAX_VALUE;
        while(j<A.length){
            int minXor = A[i]^A[j];
            min = Math.min(min, minXor);
            i++;
            j++;
        }
        return min;
    }
 }
