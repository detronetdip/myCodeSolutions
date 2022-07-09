/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} list1
 * @param {ListNode} list2
 * @return {ListNode}
 */
type ListNode = {
  val: number;
  next: Function;
};
function mergeTwoLists(list1: ListNode | null, list2: ListNode | null): ListNode | null {
  var head = new ListNode(0);
  var l2 = head;
  if (list1 == null) return list2;
  if (list2 == null) return list1;
  while (list1 != null && list2 != null) {
    if (list1.val < list2.val) {
      head.next = list1;
      list1 = list1.next;
    } else {
      head.next = list2;
      list2 = list2.next;
    }
    head = head.next;
  }
  if (list1 != null) {
    head.next = list1;
  } else if (list2 != null) {
    head.next = list2;
  }
  return l2.next;
};
