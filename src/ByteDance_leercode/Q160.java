package ByteDance_leercode;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO 编写一个程序，找到两个单链表相交的起始节点。
 * @date 2021/3/9 23:10
 */
public class Q160 {

    /**
     * 题解：设链表A的长度为a+c，链表B的长度为b+c，a为链表A不公共部分，b为链表B不公共部分，c为链表A、B的公共部分
     * 将两个链表连起来，A->B和B->A，长度：a+c+b+c=b+c+a+c，
     * 若链表AB相交，则a+c+b与b+c+a就会抵消，它们就会在c处相遇；
     * 不相交，则c为nullptr，则a+b=b+a，它们各自移动到尾部循环结束，即返回nullptr
     */

     public class ListNode{
         int val;
         ListNode next;

     }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
         ListNode a=headA;
         ListNode b=headB;

        if (headA == null || headB == null) return null;
         //1 2->null
        //5 6 7->null
        //若不想交，最后会同时指向null

         while(a!=b){
             a=a==null?headB:a.next;
             b=b==null?headA:b.next;
         }

         return a;

    }

}
