package algorithms.P021;

import java.util.*;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode result=null;
        ListNode current=null;
        int x=Integer.MAX_VALUE;
        int y=Integer.MAX_VALUE;
        while (true && (l1!=null || l2!=null)) {

            if (l1!=null) {
                x=l1.val;
            }else {
                x=Integer.MAX_VALUE;
            }

            if (l2!=null) {
                y=l2.val;
            }else {
                y=Integer.MAX_VALUE;
            }

            int min = Math.min(x,y);
            if (min==x) {
                l1=l1.next;
            }else {
                l2=l2.next;
            }

            if  (current==null)  {
                current=new ListNode(min);
            }else {
                ListNode next = new ListNode(min);
                current.next=next;
                current=next;
            }

            if (result==null) {
                result=current;
            }

            if (l1==null && l2==null) break;
        }

        return result;
    }
}
