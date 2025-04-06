class Stack {
    int [] arr;
    int top;
    int size;
   Stack(int size){
     arr = new int[size];
     top = -1;
     this.size =size;
   }
  static void push(int x){
     if(top==size){
         System.out.println("Stack OverFlow");
     }
     else{
       top++;
       arr[top] = x;
    
       System.out.println(x +" Sucessfully Added");
     }
   }
  static void pop(){
    
     if(top==-1){
       System.out.println("Stack Empty");
     }
     else{
       // arr[top] = 0;
       top--;
       System.out.println("Successfully Removed");
     }
   }
   void PrintStack(){
     for(int i=0;i<top;i++){
        System.out.print(arr[i]+" ");
     }
     System.out.println();
   }
}

//Implement //

public class Stack2{
     Stack MainStack;
     Stack MidStack;
     stack2(int size){
           MainStack = new Stack(size);
           MidStack  = new Stack(size);
    }
     void push(int x){
        MainStack.push(x);
        if(MidStack.top==-1){
            MidStack.push(x);
        }
     }
     void pop(){
        MidStack.pop();
     }
     void getMid(){
        if(MidStack.top>2)
        int mid = (MainStack.top +1)/2;
        int midValue = MainStack.arr[mid];
        MidStack.push(midValue);
     }
     else{
        System.out.println(MidStack.arr[0]);
     }
     void popMid(){

     }
}
