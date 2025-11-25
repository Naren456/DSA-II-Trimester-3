import java.util.*;
public class TowerOfHanoi {
     public static void towerOfHanoi(int n , String Source,String dest,String temp){
        if(n==0){
            return;
           }
       towerOfHanoi(n-1, Source, temp, dest);
       
       System.out.println(Source +" to "+dest);
       
       towerOfHanoi(n-1, temp, dest, Source);

     }
    public static void main(String[] args) {
        towerOfHanoi(4, "S", "D", "T");
    }
}