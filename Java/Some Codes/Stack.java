import java.util.Scanner;

public class Stack {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Node cursor = new Node();
		Pilha p = new Pilha(cursor);

		int x = in.nextInt();

		while (x > 0) {
			p.empilheirar(cursor, in.nextInt());
			x--;
		}
		p.StackPrint(cursor);

		p.Desempilhar(cursor);

		System.out.println();

		p.StackPrint(cursor);

		p.empilheirar(cursor, 4);

		System.out.println();

		p.StackPrint(cursor);

		System.out.println();

		p.Desempilhar(cursor);

		p.StackPrint(cursor);
	}
}

class Node {

	int valor;
	Node next;

	public Node() {
		this.valor = valor;
		this.next = null;
	}

}

class Pilha {

	private Node head;

	public Pilha(Node head) {
		this.head = head;
	}

	public Node empilheirar(Node cursor, int valor) {
		if (cursor.next == null) {
			Node n = new Node();
			n.valor = valor;
			n.next = cursor.next;
			cursor.next = n;
		} else {
			empilheirar(cursor.next, valor);
		}
		return cursor;

	}

	public void Desempilhar(Node cursor) {
		if (cursor.next.next == null) {
			cursor.next = null;
		} else {
			Desempilhar(cursor.next);
		}

	}

	public void StackPrint(Node cursor) {
		if (cursor.next == null) {
			System.out.print(cursor.valor + " ");
		} else {
			if (cursor == head) {
				StackPrint(cursor.next);
			} else {
				System.out.print(cursor.valor + " ");
				StackPrint(cursor.next);
			}

		}

	}

}