/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
 var deleteDuplicates = function(head) {
    if(head==null) return null;
    if(head.next==null) return head;
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