package codingNinjas.DSA.Lecture8_LinkedList1;

import codingNinjas.DSA.LinkedListNode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeLinkedList {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static LinkedListNode<Integer> takeInput() throws IOException {
        LinkedListNode<Integer> head = null, tail = null;

        String[] datas = br.readLine().trim().split("\\s");

        int i = 0;
        while(i < datas.length && !datas[i].equals("-1")) {
            int data = Integer.parseInt(datas[i]);
            LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
            if(head == null) {
                head = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                tail = newNode;
            }
            i += 1;
        }

        return head;
    }

    public static void print(LinkedListNode<Integer> head){
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while (t > 0) {

            LinkedListNode<Integer> head = takeInput();

            boolean ans = isPalindrome(head);
            System.out.println(ans);

            t -= 1;

        }

    }

    public static boolean isPalindrome(LinkedListNode<Integer> head) {
        if(head == null){
            return true;
        }
        LinkedListNode<Integer> cur = head;
        LinkedListNode<Integer> mid = findMid(head);
        LinkedListNode<Integer> last = reverse(mid);

        while(last!=null){
            if(cur.data != last.data){
                return false;
            }
            cur = cur.next;
            last = last.next;
        }
        return true;
    }

    private static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head) {
        if(head==null || head.next==null){
            return head;
        }

        LinkedListNode<Integer> newHead = reverse(head.next);
        LinkedListNode<Integer> curHeadNext = head.next;
        curHeadNext.next = head;
        head.next = null;

        return newHead;
    }

    private static LinkedListNode<Integer> findMid(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> slow = head;
        LinkedListNode<Integer> fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
