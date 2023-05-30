public class MiddleLinkedList {
    public static ListNode solution(ListNode head){

        /*
         * Ejemplos:
         * [1,2,3,4,5]
         * s=1, f=1----s=2,f=3----s=3,f=5
         * s=3---MEDIO
         * -------------------------
         * [1,2,3,4,5,6]
         * s=1, f=1----s=2,f=3----s=3,f=5----s=4,f=null
         */

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //Slow esta en el medio

        return slow;

    }
}
