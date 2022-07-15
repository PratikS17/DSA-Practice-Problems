package codingNinjas.DSA.Lecture9_LinkedList2;

import codingNinjas.DSA.LinkedListNode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MergeSortLL {
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

    public static void print(LinkedListNode<Integer> head) {
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

            LinkedListNode<Integer> newHead = mergeSort(head);
            print(newHead);

            t -= 1;
        }
    }

    public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
        if(head ==null || head.next==null){
            return head;
        }
        LinkedListNode<Integer> mid = midPoint(head);
        LinkedListNode<Integer> midNext = mid.next;
        mid.next = null;
        head = mergeSort(head);
        midNext = mergeSort(midNext);
        return mergeTwoSortedLinkedLists(head, midNext);
    }

    public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> slow = head;
        LinkedListNode<Integer> fast = head;

        while(fast!=null && fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
        if(head1 == null){
            return head2;
        }
        if(head2 == null){
            return head1;
        }
        LinkedListNode<Integer> finalHead = null;
        LinkedListNode<Integer> finalTail = null;

        if(head1.data < head2.data){
            finalHead = finalTail = head1;
            head1 = head1.next;
        }else{
            finalHead = finalTail = head2;
            head2 = head2.next;
        }

        while(head1!=null && head2!=null){
            if(head1.data < head2.data){
                finalTail.next = head1;
                finalTail = head1;
                head1 = head1.next;
            }else{
                finalTail.next = head2;
                finalTail = head2;
                head2 = head2.next;
            }
        }
        if(head1 == null){
            finalTail.next = head2;
        }else{
            finalTail.next = head1;
        }
        return finalHead;
    }
}
