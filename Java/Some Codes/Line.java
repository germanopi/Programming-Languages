import java.util.Scanner;

public class Line {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Node cursor = new Node();
		Fila f = new Fila(cursor);

		int x = in.nextInt();

		while (x > 0) {
			f.enfileirar(cursor,in.nextInt());
			x--;
		}
		
			f.LinePrint(cursor);
			
			f.desenfileirar(cursor);

			System.out.println();

			f.LinePrint(cursor);

			f.enfileirar(cursor,4);

			System.out.println();

			f.LinePrint(cursor);

			System.out.println();

			f.desenfileirar(cursor);

			f.LinePrint(cursor);
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

class Fila {

	private Node head;

	public Fila(Node head) {
		this.head = head;
	}

	public Node enfileirar(Node cursor,int valor) {
		
		if (cursor.next == null) {
			Node n = new Node();
			n.valor = valor;
			n.next = cursor.next;
			cursor.next = n;
		} else {
			enfileirar(cursor.next,valor);
		}
		return cursor;

	}

	public void desenfileirar(Node cursor) {

		if (cursor == head) {
			head = head.next;
			

		}

	}
	public void LinePrint(Node cursor) {
		if (cursor.next == null) {
			System.out.print(cursor.valor + " ");
		} else {
			if (cursor == head) {
				LinePrint(cursor.next);
			} else {
				System.out.print(cursor.valor + " ");
				LinePrint(cursor.next);
			}

		}

	}


}
