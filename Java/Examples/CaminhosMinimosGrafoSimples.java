import java.util.Scanner;

public class CaminhosMinimosGrafoSimples {

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

	public static Objeto shortestPath(Node[] grafo, int s, Node cursor) {
		int[] D = new int[5];
		int[] F = new int[5];

		for (int i = 0; i < 5; i++) {
			D[i] = -1;
			F[i] = -1;
		}
		D[s] = 0;
		F[s] = s;

		enfileirar(cursor, s);

		while (cursor.next != null) {
			int u = desenfileirar(cursor);
			Node e = grafo[u];
			while (e != null) {
				int v = e.valor;
				if (D[v] == -1) {
					D[v] = 1 + D[u];
					F[v] = u;
				}
				e = e.next;
			}
		}
		Objeto aux = new Objeto(D, F);
		return aux;
	}

	static class Objeto {
		int[] D;
		int[] F;

		public Objeto(int[] D, int[] F) {
			this.D = D;
			this.F = F;
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
