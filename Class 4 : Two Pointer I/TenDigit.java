import  java.util.*;
public class TenDigit {
    public static int[] solve(int[] A) {
        MergeSort(A,0,A.length-1);
        return A;
   }
   public static void MergeSort(int[] A ,int l,int r){
     if(l>=r) return;
     int m = (l+r)/2;
     MergeSort(A,l,m);
     MergeSort(A,m+1,r);
     Merge(A,l,m,r);
   }
   public static void Merge(int [] A ,int l ,int m ,int r){
        ArrayList<Integer> temp = new ArrayList<>();
        int i = l;
        int j = m+1;
       //  int k=0;
        while(i<=m && j<=r){
            if(helper(A[i])<helper(A[j])){
            temp.add(A[i]);
            i++;
        }
      else if (helper(A[i])>helper(A[j]) ){
                temp.add(A[j++]);
        }
        else{
            if(A[i]>=A[j]){
                temp.add(A[i++]);
            }
            else{
                temp.add(A[j++]);
            }
        }
   }
       while(i<=m){
             temp.add(A[i++]);
        }
       while(j<=r){
             temp.add(A[j++]);
        }
        for (int k=0;k<temp.size();k++){
            A[l+k] = temp.get(k); 
        }

   }
   public static int helper(int num){
       return (num/10)%10;
   }
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] A = new int[n];
       for (int i = 0; i < n; i++) {
           A[i] = sc.nextInt();
       }
       int[] Ans = solve(A);
       for (int i = 0; i < n; i++) {
        System.out.print(A[i]+" ");
    }
   }
}
