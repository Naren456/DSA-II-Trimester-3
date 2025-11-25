



class NodeList{
    int val;
    NodeList next;
     NodeList(int val) {
      this.val = val;
      this.next = null;
    }    
}
public class Main{
  static NodeList head;

  public static void main(String[] args) {
      head = new NodeList(1);
      addAtStart(7);
      addAtStart(10);
      printNodeList();
      
  }
  public static void addAtStart(int data){

    NodeList newNode = new NodeList(data);
     if(head==null){
      head = newNode;
      return;
     }
     newNode.next = head;
     head = newNode;
  }
  public static void printNodeList(){
    NodeList temp = head;
    while(temp!=null){
      System.out.print(temp.val+" -> ");
      temp=temp.next;
    }
    System.out.println("null");
  }
  public static void DeleteNode(int position){
     if(position==0){
        head = head.next;
        return;
     }
     int count = 0;
     NodeList temp = head;
     while(temp!=null && count!=position-1){
      temp = temp.next;
     }
     if(temp.next.next==null){
         temp.next = null;  
       
     }
     else{
     temp.next = temp.next.next;}
     
     return;

  }
}