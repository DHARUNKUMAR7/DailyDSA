package com.company;

public class INSERTIONSORTLINKEDLIST {
    public static void main(String[] args) {

    }
    public ListNode insertionSortList(ListNode head) {
        ListNode start=new ListNode();
        start.next=head;
        ListNode prev=start,current=head;
        while(current!=null){
            if(current.next!=null&&(current.next.val<current.val)){
                while(prev.next!=null&&(prev.next.val<current.next.val)){
                    prev=prev.next;
                }
                ListNode temp=prev.next;
                prev.next=current.next;
                current.next=current.next.next;
                prev.next.next=temp;
                prev=start;
            }
            else{
                current=current.next;
            }
        }
        return start.next;

    }
}
