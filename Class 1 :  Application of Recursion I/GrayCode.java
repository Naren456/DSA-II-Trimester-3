import java.util.ArrayList;

public class GrayCode {
    static ArrayList<String> GrayCode(int n){
        ArrayList<String> list = new ArrayList<>();
         if(n==1){
            list.add("1");
            list.add("0");
            return list;
        }
     
        return GrayCode(n-1);
        
        for (int i=0;i<list.size();i++){
        list.add("0"+list.get(i));};
        for (int i=list.size()-1;i>=0;i--){
        list.add("1"+list.get(i));};
        
       
    }
    public static void main(String[] args) {
        System.out.println(GrayCode(2));
    }
}