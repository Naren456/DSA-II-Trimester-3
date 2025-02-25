import java.util.Scanner;

public class SingleNumber {
    public static int singleNumber(final int[] A) {
        long num = 0;
        for (int i=0;i<A.length;i++){
            num = (long)num^A[i];
        }
        return (int)num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = {1,2,2,3,1};
        System.out.println(singleNumber(A));
    }
    
}
