import java.util.Scanner;

class Node {

	int valor;
	Node next;

	public Node() {
		this.valor = valor;
		this.next = null;
	}

}

class Lista {

	private Node head;

	public Lista(Node head) {
		this.head = head;
	}

	public Node Listposition(Node cursor, int pos) {

		for (int i = 0; i < pos & cursor != null; i++) {
			cursor = cursor.next;
		}
		return cursor;
	}

	public Node ListpositionValor(Node cursor, int valor) {

		while (cursor.next != null && cursor.next.valor != valor) {
			cursor = cursor.next;
		}
		return cursor;
	}

	public Node ListInsert(Node cursor, int valor) {
		if (cursor.next == null) {
			Node n = new Node();
			n.valor = valor;
			n.next = cursor.next;
			cursor.next = n;
		} else {
			ListInsert(cursor.next, valor);
		}
		return cursor;

	}

	public void ListDelete(Node cursor, int valor) {
		if (cursor.next.valor == valor) {
			cursor.next = cursor.next.next;
		} else {
			ListDelete(cursor.next, valor);
		}

	}

	public void ListPrint(Node cursor) {
		if (cursor.next == null) {
			System.out.print(cursor.valor + " ");
		} else {
			if (cursor == head) {
				ListPrint(cursor.next);
			} else {
				System.out.print(cursor.valor + " ");
				ListPrint(cursor.next);
			}

		}

	}

}

public class LinkedList {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Node cursor = new Node();
		Lista l = new Lista(cursor);

		int x = in.nextInt();
		while (x > 0) {
			l.ListInsert(cursor, in.nextInt());
			x--;
		}

		l.ListPrint(cursor);
		System.out.println();
		l.ListDelete(cursor, 3);
		l.ListPrint(cursor);
		System.out.println();
		l.ListInsert(cursor, 4);
		l.ListPrint(cursor);

	}
}
