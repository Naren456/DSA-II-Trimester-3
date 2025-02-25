import java.util.Scanner;

public class fibonacci {
      public static  int findAthFibonacci(int A) {
        if(A==0||A==1){
            return A;
        }
        return findAthFibonacci(A-1)+findAthFibonacci(A-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = findAthFibonacci(n);
        System.out.println(ans);
    }
}
