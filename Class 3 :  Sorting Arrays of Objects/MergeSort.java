public class MergeSort {
    public static void MergeSort(int [] A,int l , int r){
        int mid = (l+r)/2;
       MergeSort(A,l,m);
        MergeSort(A, m+1, r);
        Merge(A,l,m,r); 
    }
    public static Merge(int[] A,int l,int m ,int r){
                      
    }
    public static void main(String[] args) {
        
    }
}
