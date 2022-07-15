package CodingNinjas.DSA.Lecture12_Trees;

public class Node<T> {

    T data;
    Node<T> next;

    Node(T data){
        this.data = data;
        next = null;
    }

}
