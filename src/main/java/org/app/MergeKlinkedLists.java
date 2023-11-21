package org.app;
import java.util.*;

public class MergeKlinkedLists {
    public static ListNode merge(List<ListNode> lists){
        ListNode resHead = new ListNode(0); // dummy head, 
        ListNode currHead = resHead.next; // should point to null/replaceable head

        ListNode minHead = null;
        while(true){

            int minValue = Integer.MAX_VALUE;

            // find the current minimum
            for(ListNode head : lists){
                if(head!=null){
                    if(head.val <= minValue){
                        minValue = head.val;
                        minHead = head;
                    }
                }
            }

            if(minValue == Integer.MAX_VALUE)
            {
                // all list elements have been inserted
                break;
            }

            // add the min to the current linked list
            currHead = new ListNode(minValue);
            currHead = currHead.next;

            // move the selected minimum head to the next value
            minHead = minHead.next;
        }

        return resHead.next;
    }
}
