class Node {
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}
   


class Stack {
    Node head;
    int size;
    Stack(){
        head = null;
        size = 0;
    }
    void push(int x){
        Node newNode = new Node(x);
        if(head == null){
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        size++;
        System.out.println(x + " Successfully Added");
    }
    void pop(){
        if(head == null){
            System.out.println("Stack Empty");
        }
        else{
            head = head.next;
            size--;
            System.out.println("Successfully Removed");
        }
    }
    void PrintStack(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}


public class StackwithLInkedlist {
    public static void main(String[] args) {
        java.util.Stack st = new java.util.Stack();
        Stack stack = new Stack();      
        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.PrintStack();
        stack.pop();
        stack.PrintStack();
        stack.pop();
        stack.PrintStack();
        stack.pop();
        stack.PrintStack();
        stack.pop();    
        stack.PrintStack();
        stack.push(40);
    }
}
