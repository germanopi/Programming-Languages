import java.util.Scanner;

public class BinaryTree {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Node cursor = new Node();
		Lista l = new Lista(cursor);

		cursor.valor = 10;
		l.insertDir(cursor, 15);
		l.insertEsq(cursor, 7);
		l.insertDir(cursor.dir, 20);
		l.insertEsq(cursor.esq, 3);
		l.insertDir(cursor.esq, 9);

		System.out.print("A arvore em pre Ordem é : ");
		preorder(cursor);
		System.out.println();
		System.out.print("A arvore em Ordem     é : ");
		inOrder(cursor);
		System.out.println();
		System.out.print("A arvore em pós Ordem é : ");
		posOrder(cursor);
		System.out.println();
		System.out.print("A altura da arvore    é : ");
		System.out.print(altura(cursor,0,0,0));

	}

	private static int altura(Node cursor,int r,int l,int h) {
		if (cursor == null) {
			return 0;
		} else {
			l = altura(cursor.esq,r,l,h);
			r = altura(cursor.dir,r,l,h);
			if (l >= r) {
				h = 1 + l;
			} else {
				h = 1 + r;
			}
			return h;
		}

	}

	private static void preorder(Node cursor) {
		if (cursor == null) {
			return;

		}
		visit(cursor);
		preorder(cursor.esq);
		preorder(cursor.dir);
	}

	private static void inOrder(Node cursor) {
		if (cursor == null) {
			return;

		}
		inOrder(cursor.esq);
		visit(cursor);
		inOrder(cursor.dir);
	}

	private static void posOrder(Node cursor) {
		if (cursor == null) {
			return;

		}
		posOrder(cursor.esq);
		posOrder(cursor.dir);
		visit(cursor);
	}

	private static void visit(Node cursor) {
		System.out.print(cursor.valor + " ");
	}

}

class Node {

	int valor;
	Node dir;
	Node esq;

	public Node() {
		this.valor = valor;
		this.dir = null;
		this.esq = null;
	}

}

class Lista {

	private Node head;

	public Lista(Node head) {
		this.head = head;
	}

	public Node insertEsq(Node cursor, int valor) {

		if (cursor.esq == null) {
			Node n = new Node();
			n.valor = valor;
			n.esq = cursor.esq;
			cursor.esq = n;
		} else {
			insertEsq(cursor.esq, valor);
		}
		return cursor;

	}

	public Node insertDir(Node cursor, int valor) {

		if (cursor.dir == null) {
			Node n = new Node();
			n.valor = valor;
			n.dir = cursor.dir;
			cursor.dir = n;
		} else {
			insertEsq(cursor.dir, valor);
		}
		return cursor;

	}

}
