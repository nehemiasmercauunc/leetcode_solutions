import java.util.ArrayList;
import java.util.List;

public class PalindromeList {
    public static boolean solutionArray(ListNode head) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        
        //armar el array 
        while(head!=null){
            array.add(head.val);
            head = head.next;
        }

        int l = 0; int r = array.size()-1;
        while (l <= r){
            if(array.get(l) != array.get(r)){
                return false;
            }
            l++;r--;
        }
        return true;
    }

    public static boolean solutionList(ListNode head){
        /*
         * Se hace en varios pasos:
         * - Se encuentra el medio
         * - Con lo del medio para adelante, se hace un reverse linked list
         * - Entonces queda la primera mitad sin tocar, y la segunda mitad dada vuelta
         * - Como se busca 'palindromo' (racecar ó 1 2 3 1 2 3) se compara nodo 0 con nodo medio y asi se avanza
         * - Si todos son iguales, es palindromo, sino no.
         */
        ListNode fast = head;
        ListNode slow = head;

        /*
        Encontrar el medio:
            - slow avanza de a 1
            - fast avanza de a 2
                --> cuando fast llegue al final (null), slow va a estar en el medio de la lista
                --> Ese es el medio.
        */

        while(fast != null && fast.next != null){//fast.next != null xq cierra cuando llegue a null
            fast = fast.next.next; //fast avanza de a 2: [3,2,1,1,2,3] fast toma en 3, 1, 2, null
            slow = slow.next; //slow avanza de a 2: [3,2,1,1,2,3] slow toma en 3, 2, 1, 1   
        }
        //A esta altura, ya tengo el medio (slow)
        
        // Aca hay que dar vuelta la parte alta de la lista (1,2,3)--->(3,2,1)
        ListNode prev = null;
        while (slow != null) { //1 | 2 | 3->null
            ListNode tmp = slow.next; // 2 | 3 | null
            slow.next = prev; // 1->null |  2->1 |  3->2
            prev = slow; // 1->null | 2->1 | 3->2
            slow = tmp; // 2->3 | 3->null | null
        }

        ListNode newSlow = prev;
        //Tengo el nuevo medio, la lista alta, dada vuelta 3,2,1

        //ver si son iguales
        ListNode left = head;
        ListNode right = newSlow;
        while(right != null){
            if(left.val != right.val){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        //Es un palindromo
        return true;       
        
    }
}

