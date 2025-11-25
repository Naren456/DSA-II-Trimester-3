public class QuickSort {
    public void QuickSort(int [] A,int s ,int e){
        if(s<=e) return;
        int p = partion(A,s,e);
        QuickSort(A, s, p);
        QuickSort(A, p+1, e);
        
    }
    public int partion(int[] A,int l ,int r){
        int s = l+1, e=r;
        while(s<=e){
            if(A[s]<=A[0]){
                s++;
            }
            else if(A[e]>=A[0]){
                e--;
            }
            else{
                Swap(A,s,e);
                s++;
                e--;
            }
            Swap(A,0,e);
        }
    }

    public static void main(String[] args) {
        
    }
}
