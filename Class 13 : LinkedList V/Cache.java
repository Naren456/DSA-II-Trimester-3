class Node{
    int val;
    Node next;
    Node prev;
    Node(int val){
      this.val = val;
      this.next =null;
      this.prev = null;
    }
}


public class Cache {
    int size;
    Node head;
    Node tail;
    Cache(int val){
         this.size = 0;
         this.head = new Node(val);
         this.tail = this.head;
    }
    void add(int value){
     if(search(value)){
         
     } 
     else{
       if(size<=current_size){ 
        insertAthead(val);
       }
     }
    }
    void search(){
        ListNode temp = head;
        while (temp!=null) {
              if(temp.val==value){
              }
        }
        return false;
    }
    void insertAthead(int val){
       Node newNode = new Node(val);
       head.next = newNode;
       newNode =head;
    }
}