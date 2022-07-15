package codingNinjas.DSA.Lecture8_LinkedList1;

import codingNinjas.DSA.LinkedListNode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EliminateDuplicatesFromLL {
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

            head = removeDuplicates(head);
            print(head);

            t -= 1;
        }
    }


    public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
        if(head == null){
            return head;
        }
        LinkedListNode<Integer> prev =head;
        LinkedListNode<Integer> curr =head;

        while(curr!=null){
            if(prev.data != curr.data){
                prev.next = curr;
                prev = curr;
            }
            curr = curr.next;
        }
        prev.next = curr;
        return head;
    }
    //Editorial Solutions
    public static LinkedListNode<Integer> removeDuplicates2(LinkedListNode<Integer> head) {
        if (head == null) {
            return head;
        }
        LinkedListNode<Integer> currHead = head;
        while (currHead.next != null) {
            if (currHead.data.equals(currHead.next.data)) {
                currHead.next = currHead.next.next;
            } else {
                currHead = currHead.next;
            }
        }
        return head;
    }

}
