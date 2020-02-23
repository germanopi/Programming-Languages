import java.util.Scanner;

public class GrafoDFSsemlista {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Node[] grafo = new Node[5];

		for (int i = 0; i < 5; i++) {
			grafo[i] = new Node(in.nextInt());
		}
		Node aux = new Node(0);
		arestas(grafo, 2, 3, 0, aux);
		arestas(grafo, 1, 4, 0, aux);

		DFS(grafo, 5);
	}

	public static void arestas(Node[] grafo, int A, int B, int i, Node aux) {
		while (i < 5) {
			if (grafo[i].valor == A) {
				aux = grafo[i];
				if (aux.next == null) {
					Node n = new Node(B);
					n.valor = B;
					n.next = null;
					grafo[i].next = n;
					aux = grafo[i].next;
				} else {
					arestas(grafo, A, B, i, aux);
				}
			}
			i++;
		}
	}

	public static void DFS(Node[] grafo, int vertices) {
		boolean[] P = new boolean[vertices];

		for (int i = 0; i < vertices - 1; i++) {
			if (P[i] == false) {
				DFSVisit(grafo, i, P);
			}
		}
	}

	private static void DFSVisit(Node[] grafo, int i, boolean[] P) {
		P[i] = true;
		/* pre.visit(grafo,i) */
		Node e = grafo[i];

		while (e != null) {
			int valor = e.valor;
			if (P[valor] == false) {
				DFSVisit(grafo, valor, P);
			}
			e = e.next;
		}
		/* pos.visit(grafo,i) */
	}

	static class Node {

		Node next;
		int valor;

		public Node(int valor) {
			this.next = null;
			this.valor = valor;
		}

	}

}