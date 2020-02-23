import java.util.Scanner;

public class GrafoBFS {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Node[] grafo = new Node[5];
		Node cursor = new Node();
		for (int i = 0; i < 5; i++) {
			grafo[i] = new Node();
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				ListInsert(grafo[i], in.nextInt());
			}
		}
	}

	public static void BFS(Node[] grafo, Node cursor) {
		int[] P = new int[5];

		for (int s = 0; s < 5; s++) {
			if (P[s] == 0) {
				BFSVisit(grafo, s, P, cursor);
			}
		}
	}

	private static void BFSVisit(Node[] grafo, int s, int[] P, Node cursor) {
		P[s] = 1;
		enfileirar(cursor, s);

		while (cursor.next != null) {
			int u = desenfileirar(cursor);
			// previsit;
			Node e = grafo[u];

			while (e != null) {
				int v = e.valor;
				if (P[v] == 0) {
					P[v] = 1;
					enfileirar(cursor, v);
				}
				e = e.next;
			}
			// postvisit(grafo,u);
		}

	}

	public static int desenfileirar(Node cursor) {
		int aux = 0;
		if (cursor.valor != 0) {
			aux = cursor.valor;
			cursor = cursor.next;
			return aux;
		}
		return aux;

	}

	public static Node enfileirar(Node cursor, int valor) {

		if (cursor.next == null) {
			Node n = new Node();
			n.valor = valor;
			n.next = cursor.next;
			cursor.next = n;
		} else {
			enfileirar(cursor.next, valor);
		}
		return cursor;

	}

	public static Node ListInsert(Node cursor, int valor) {
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

	static class Node {

		int valor;
		Node next;

		public Node() {
			this.valor = valor;
			this.next = null;
		}

	}
}
