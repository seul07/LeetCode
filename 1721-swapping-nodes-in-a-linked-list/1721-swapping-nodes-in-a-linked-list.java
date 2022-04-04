/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode list = head;
        Map<Integer,ListNode> map = new HashMap<>();
        int index = 1;
        while(list!=null){
            map.put(index, list);
            index++;
            list = list.next;
        }
        int tmp = map.get(k).val;
        map.get(k).val = map.get(index - k ).val;
        map.get(index - k ).val = tmp;
        return head;
    }
}