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
    public int getDecimalValue(ListNode head) {
        String s="";
        ListNode curr=head;
        while(curr!=null){
            s+=curr.val;
            curr=curr.next;
        }
        int result=0;
        int powof2=1;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                result=result+powof2;
            }
            powof2=powof2*2;
        }
        return result;
    }
}