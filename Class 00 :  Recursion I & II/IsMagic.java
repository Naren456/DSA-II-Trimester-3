
import java.util.Scanner;

public class IsMagic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       System.out.println(SuperSum(n));
    }
    public static int SumOFDigit(int num){
        if(num==0){
            return 0;
        }
       return num%10 + SumOFDigit(num/10);
    }
    public static int SuperSum(int num){
        if(num==1){
            return 1;
        }
        else if (num<10){
            return 0;
        }
        num = SumOFDigit(num);
        return SuperSum(num);
    }
    
}
