/**
 * Definition for singly-linked list.
 * class ListNode {
 *     val: number
 *     next: ListNode | null
 *     constructor(val?: number, next?: ListNode | null) {
 *         this.val = (val===undefined ? 0 : val)
 *         this.next = (next===undefined ? null : next)
 *     }
 * }
 */

 function deleteDuplicates(head: ListNode | null): ListNode | null {
    if(head===null) return null;
        if(head.next===null) return head;
        var p1=head;
        var p2=head.next;
        while(p2.next!=null){
            if(p1.val===p2.val){
                p1.next=p2.next;
                p2=p2.next;
            }else{
                p1=p1.next;
                p2=p2.next;
            }
        }
        if(p1.val===p2.val){
                p1.next=null;
        }
        return head;
};