import java.util.Scanner;

public class GrafoDFS {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Node[] grafo = new Node[5];

		for (int i = 0; i < 5; i++) {
			grafo[i] = new Node();
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				ListInsert(grafo[i], in.nextInt());
			}
		}
	}

	public static void DFS(Node[] grafo) {

		int[] P = new int[5];

		for (int s = 0; s < 5; s++) {
			if (P[s] == 0) {
				DFSVisit(grafo, s, P);
			}
		}
	}

	private static void DFSVisit(Node[] grafo, int s, int[] P) {

		P[s] = 1;
		// previsit(grafo,s);
		Node e = grafo[s];

		while (e != null) {
			int v = e.valor;
			if (P[v] == 0) {
				DFSVisit(grafo, v, P);
			}
			e = e.next;
		}
		// posvisit(grafo,s);
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


