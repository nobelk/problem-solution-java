package org.app;

public class ListHasCycle {
    public boolean hasCycle(ListNode head){

        ListNode fastPtr = head;
        ListNode slowPtr = head;

        while(fastPtr != null && fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;

            if(slowPtr != null && fastPtr != null){
                if(slowPtr == fastPtr){
                    return true;
                }
            }
        }

        return false;
    }
}
