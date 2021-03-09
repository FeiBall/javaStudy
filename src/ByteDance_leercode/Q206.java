package ByteDance_leercode;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO 反转一个单链表
 * @date 2021/3/9 21:14
 */
public class Q206 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseList(ListNode head) {
        ListNode cur=head;//初始化当前节点指向头像
        ListNode pre=null;//初始化前一个节点指向null
        ListNode tmp=null;//临时节点

        //1->2-> 3-> null

        while(cur!=null){
            tmp=cur.next;//cur=1,tmp=2
            cur.next=pre;//null<- 1
            pre=cur;//向前移动一位
            cur=tmp;//向前移动一位
        }
        //null <- 1 <- 2 <-3
        return pre;

    }


}
