package org.app;

public class MergeTwoSortedLinkedlists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2){

        if(list1==null && list2==null){
            return null;
        }

        ListNode cur = null;
        ListNode head = null;

        while(list1 != null || list2 != null){
            if(list1 != null && list2 !=null){
                if(list1.val <= list2.val){
                    cur = new ListNode(list1.val);
                    list1 = list1.next;
                }
                else{
                    cur = new ListNode(list2.val);
                    list2 = list2.next;
                }
            }
            else if (list1 != null){
                cur = new ListNode(list1.val);
                list1 = list1.next;
            }
            else if (list2 != null){
                cur = new ListNode(list2.val);
                list2 = list2.next;
            }

            if(head==null)
                head = cur;
            cur = cur.next;
        }

        return head;
    }

    public static void main(String[] args){
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode head = MergeTwoSortedLinkedlists.mergeTwoLists(l1, l2);
    }

}
