

public class MergeNodeList {

    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
          ListNode ans = null;
           ListNode temp1 = l1;
           ListNode temp2 = l2;
           while(temp1!=null && temp2!=null){
               if(temp2.val<temp1.val){
                    temp2.next = temp1;
                    temp2 = temp2.next;
               }
               else{
                temp1.next = temp2;
                temp1= temp1.next;
               }
           }
           if(temp1=null){
            temp2.next =temp1; 
           }
           if(temp2!=null){
            temp1.next =temp2; 
           }
           return temp1;
    }

    public static ListNode MergeSort(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode midNode = MiddleNode(head);
        head = MergeSort(midNode);
        h2 =  MergeSort(midNode.next);
       return MergeNodeList(head,h2);
    }


    public static void main(String[] args) {
        // Create first linked list: 1->3->5
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);

        // Create second linked list: 2->4->6
        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(6);

        // Print original lists
        System.out.println("List 1:");
        printList(l1);
        System.out.println("List 2:");
        printList(l2);

        // Merge lists
        ListNode mergedList = mergeTwoLists(l1, l2);

        // Print merged list
        System.out.println("Merged List:");
        printList(mergedList);
    }

    // Helper method to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}