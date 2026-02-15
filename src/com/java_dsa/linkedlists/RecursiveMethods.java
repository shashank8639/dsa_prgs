package com.java_dsa.linkedlists;

import java.util.Scanner;

class Node<T>{
	
	T data;
	Node<T> next;
	public Node(T data) {
		this.data = data;
	}
}
public class RecursiveMethods {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		Node<Integer> head = takeInput();
		System.out.println("=======completed with inputs=========");
		System.out.println("===================");
		printRecursive(head);
		System.out.println("==============");
		head = insertNodeR(head,2, 20);
		printRecursive(head);
		System.out.println("====end insertion ===============");
		head = deleteNodeR(head, 2);
		printRecursive(head);
	}

	private static Node<Integer> deleteNodeR(Node<Integer> head, int pos) {
		if(head == null)
			return head;
		
		if(pos== 0)
			return head.next;
		
		head.next = deleteNodeR(head.next, pos-1);
		
		return head;
	}

	private static Node<Integer> insertNodeR(Node<Integer> head, int pos, int element) {
	    if (pos < 0) return head;
	    
	    // If position is 0 or list is empty
	    if (pos == 0 || head == null) {
	        Node<Integer> newNode = new Node<>(element);
	        newNode.next = head;
	        return newNode;
	    }
	    
	    // If we reach end but position still > 0, insert at end
	    if (head.next == null && pos > 0) {
	        head.next = new Node<>(element);
	        return head;
	    }
	    
	    head.next = insertNodeR(head.next, element, pos - 1);
	    return head;
	}

	private static void printRecursive(Node<Integer> head) {
		if(head == null)
			return;
		
		System.out.print(head.data+" ");
		printRecursive(head.next);
	}

	private static Node<Integer> takeInput() {
		
		System.out.println("Enter the data");
		int data = sc.nextInt();
		Node<Integer> head = null,tail = null;
		Node<Integer> newNode = new Node<>(data);
		while(data != -1) {
			if(head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = new Node<>(data);
				tail = tail.next;
			}
			System.out.println("Enter data");
			data = sc.nextInt();
		}
		return head;
	}

}
