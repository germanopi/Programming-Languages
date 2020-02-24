import java.util.Scanner;

public class ConjuntosDisjuntosComPathCompression {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

	}

	public static Node makeSet(int x) {
		Node n = new Node();
		n.valor = x;
		n.parent = n;
		n.altura = 1;
		return n;
	}

	public static Node findRepresentante(Node x) {
		if (x.parent == x) {
			return x;
		} else {
			return findRepresentante(x.parent);
		}
	}

	public static Node findRepresentantePathCompression(Node x) {
		if (x.parent != x) {
			x.parent = findRepresentantePathCompression(x.parent);
		}
		return x.parent;
	}

	public static Node Union(Node x, Node y) {
		Node rx = findRepresentante(x);
		Node ry = findRepresentante(y);

		if (rx.altura > ry.altura) {
			ry.parent = rx;
			if (rx.altura == ry.altura) {
				rx.altura = rx.altura + 1;
			}
			return rx;
		} else {
			rx.parent = ry;
			return ry;
		}

	}

	static class Node {

		int valor;
		Node parent;
		Node next;
		int altura;

		public Node() {
			this.altura = 0;
			this.valor = valor;
			this.parent = null;
			this.next = null;
		}

	}

}
