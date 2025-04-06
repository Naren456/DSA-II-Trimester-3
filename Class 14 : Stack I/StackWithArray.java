
class Stack {
     int [] arr;
     int top;
     int size;
    Stack(int size){
      arr = new int[size];
      top = -1;
      this.size =size;
    }
   void push(int x){
      if(top==size){
          System.out.println("Stack OverFlow");
      }
      else{
        top++;
        arr[top] = x;
     
        System.out.println(x +" Sucessfully Added");
      }
    }
   void pop(){
     
      if(top==-1){
        System.out.println("Stack Empty");
      }
      else{
        // arr[top] = 0;
        top--;
        System.out.println(" Successfully Removed");
      }
    }
    void PrintStack(){
      for(int i=0;i<top;i++){
         System.out.print(arr[i]+" ");
      }
      System.out.println();
    }
}


class MinStack{
    Stack st; 
    MinStack(int size){
     st = new Stack(size);
   }
   void getMin(){
    if(st.top==-1){
      System.out.println("Empty");
    }
    else{
      int min = Integer.MAX_VALUE;
      for (int i=0;i<st.top;i++){
        min = Math.min(min,st.arr[st.top]);
      }
      System.out.println(min);
    }
   }
   void push(int x){
     st.push(x);
   }
   void pop(){
    st.pop();
   }

}



public class StackWith {
  public static void main(String[] args) {
    MinStack st = new MinStack(4);
    st.push(4);
    st.push(5);
    st.push(10);
    st.push(85);
    st.pop();
    st.getMin();
  }
    
}
