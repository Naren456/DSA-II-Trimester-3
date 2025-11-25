import java.util.ArrayList;

public class GrayCode {
    static ArrayList<String> GrayCode(int n){
        ArrayList<String> list = new ArrayList<>();
         if(n==1){
            list.add("1");
            list.add("0");
            return list;
        }
     
        ArrayList<String> list1 =  GrayCode(n-1);
        
        for (int i=0;i<list1.size();i++){
        list.add("0"+list1.get(i));};
        for (int i=list1.size()-1;i>=0;i--){
        list.add("1"+list1.get(i));};
        
       return list;
    }
    public static void main(String[] args) {
        System.out.println(GrayCode(2));
    }
}