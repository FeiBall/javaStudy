package ByteDance_leercode;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO
 * @date 2021/3/20 0:55
 */
public class 判断链表是否有环 {
    /**
     * 定义链表
     */
    public static class Node{
        int val;
        Node next;
        Node(int val){this.val=val;}
    }


    public boolean ishuan(Node head) {
        Node slowNode=head;
        Node fastNode=head;

        while(fastNode!=null&&fastNode.next!=null){
            slowNode=slowNode.next;
            fastNode=fastNode.next.next;

            if(slowNode==fastNode) return true;
        }
        return false;

    }
}
