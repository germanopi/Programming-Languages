import java.util.Scanner;

public class ConjuntosDisjuntosA {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Node a = new Node();
		Node b = new Node();

		Makeset(2);
		Makeset(3);
		find(a);
		Union(a, b);
		
		
	}

	public static Node Makeset(int x) {
		Node N = new Node();
		N.valor = x;
		N.par = N;
		N.height = 1;
		return N;
	}

	public static Node find(Node x) {
		if (x.par == x) {
			return x;
		} else {
			return find(x.par);
		}
	}

	public static Node Union(Node x, Node y) {
		Node rx = find(x);
		Node ry = find(y);

		if (rx.height >= ry.height) {
			ry.par = rx;
			if (rx.height == ry.height) {
				rx.height = rx.height + 1;
			}
			return rx;
		} else {
			rx.par = ry;
			return ry;
		}
	}

	public static Node findPc(Node x) {
		if (x.par != x) {
			x.par = findPc(x.par);
		}
		return x.par;
	}
}

class Node {

	int valor;
	Node par;
	Node next;
	int height;

	public Node() {
		this.height = 0;
		this.valor = valor;
		this.par = null;
		this.next = null;
	}

}