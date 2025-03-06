
import java.util.Scanner;

class ListNode{
 int val;
 ListNode next;
ListNode(int x) {
          val = x;
          next = null;  
    }
}
public class ReverseList {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int nn = sc.nextInt();
        ListNode head = new ListNode(nn);
        for (int i = 1 ;i <num;i++){
            int n  = sc.nextInt();
            head=add(head,n);
        }
    //    head = reverseList(head);
       
    printListNode(head);
        System.out.println("Middle Element :"+FindMiddleElement(head));
       head = reverseList_K(head, 2);
       printListNode(head);
   }   

//Reverse  the Linkedlist  // 
   public static  ListNode reverseList(ListNode head) {
    ListNode current = head;
     ListNode nextNode = head;
    ListNode head2 = null;
    while(current!=null){
        nextNode = current.next;
        head2 = insertAtStart(current,head2);
        current = nextNode;
    }
    return head2;
}
public static ListNode insertAtStart(ListNode node,ListNode head){
     node.next=head;
     head = node;
     return head;
}

//----------------//


public static  ListNode add(ListNode head,int val){
   ListNode newNode = new ListNode(val);
   if(head==null){
       head = newNode;
       return head;
   }
   ListNode temp = head;
   while(temp.next!=null){
    temp= temp.next;
   }
   temp.next = newNode;
   return head;
}
public static void printListNode(ListNode head){
    ListNode temp = head;
    while(temp!=null){
        System.out.print(temp.val);
        if(temp.next!=null){
            System.out.print(" -> ");
        }
        else{
            System.out.println(" -> Null");
        }
        temp = temp.next;
    }
  
}

// Find the middle Element//
public static int FindMiddleElement(ListNode head){
    ListNode slow  =  head;
    ListNode fast  =  head;
    while(fast!=null && fast.next!=null){
        fast =fast.next.next;
        slow = slow.next;
    }
    return slow.val;
}
// ReverseLIst K group //
public static  ListNode reverseList_K(ListNode head ,int K) {
    if(head==null) return null;
    ListNode current = head;
     ListNode nextNode = head;
    ListNode head2 = null;
    int count = K;
    while(current!=null && count>0){
        nextNode = current.next;
        head2 = insertAtStart(current,head2);
        current = nextNode;
        count--;
    }
    head.next =reverseList_K(current,K);
    return head2;
}
}