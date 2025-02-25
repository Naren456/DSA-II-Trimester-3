
import java.util.Scanner;



public class StrangeEquality {
    public static int solve(int A) {
        int X = SmallestNumber(A);
        // int Y = GreatestNumber(A);
        return X;
    }

    // // public int GreatestNumber(int A) {//Ceil//
    //     int Y = 0;
    //     for (int i=31; i>=0; i--) {
    //         if(CheckBIt(A,i)) {
    //             Y = SetBit(Y,i+1);
    //             break;
    //         }
    //     }
    //     return Y;
    // }

    public static int SmallestNumber(int A) {//floor//
      int X = 0;
      int Y =0;
      boolean p = false;
      for(int i=31;i>=0;i--){
          if(CheckBIt(A,i) && !p){
             p=true;
                Y = SetBit(Y,i+1);
          }
          if(p && !CheckBIt(A,i)){
               X= SetBit(X,i);             
          }
      }
      System.out.println("X: "+X);
      System.out.println("Y: "+Y);
     return X^Y;
    }

    public static boolean CheckBIt(int A,int i) {
        return (A&(1<<i))!=0;
    }

    public static int SetBit(int A,int i) {
        return (A|(1<<i));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1;i<num;i++){
            System.out.println("num :"+i);
        System.out.println("X^Y : "+solve(i));}
    }
}
