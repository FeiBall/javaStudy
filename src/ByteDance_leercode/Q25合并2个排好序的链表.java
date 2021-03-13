package ByteDance_leercode;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO
 * @date 2021/3/13 14:03
 */
public class Q25合并2个排好序的链表 {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int val){this.val=val;}
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null||l2==null){
            return l1==null?l2:l1;
        }

        if(l1.val<l2.val){
            l1.next= mergeTwoLists(l1.next,l2);
            return l1;
        }else{
            l2.next=mergeTwoLists(l1,l2.next);
            return l2;
        }
    }
}
