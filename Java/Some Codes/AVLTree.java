import java.util.Scanner;

class Node {
	int valor, altura;
	Node left, right;

	Node(int valor) {
		this.valor = valor;
		altura = 1;
	}
}

class AVLTree {

	Node root;

	static int altura(Node cursor) {
		if (cursor == null)
			return 0;

		return cursor.altura;
	}

	static int max(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	static Node RotateRight(Node cursor) {
		Node L = cursor.left;
		Node RL = L.right;

		L.right = cursor;
		cursor.left = RL;

		cursor.altura = max(altura(cursor.left), altura(cursor.right)) + 1;
		L.altura = max(altura(L.left), altura(L.right)) + 1;

		return L;
	}

	static Node RotateLeft(Node cursor) {
		Node R = cursor.right;
		Node LR = R.left;

		R.left = cursor;
		cursor.right = LR;

		cursor.altura = max(altura(cursor.left), altura(cursor.right)) + 1;
		R.altura = max(altura(R.left), altura(R.right)) + 1;

		return R;
	}

	static int Balance(Node cursor) {
		if (cursor == null)
			return 0;

		return altura(cursor.left) - altura(cursor.right);
	}

	static Node insert(Node cursor, int valor) {

		if (cursor == null)
			return (new Node(valor));

		if (valor < cursor.valor)
			cursor.left = insert(cursor.left, valor);
		else if (valor > cursor.valor)
			cursor.right = insert(cursor.right, valor);
		else
			return cursor;

		cursor.altura = 1 + max(altura(cursor.left), altura(cursor.right));

		int balance = Balance(cursor);
		if (balance > 1 && valor < cursor.left.valor)
			return RotateRight(cursor);

		// Right Right Case
		if (balance < -1 && valor > cursor.right.valor)
			return RotateLeft(cursor);

		// Left Right Case
		if (balance > 1 && valor > cursor.left.valor) {
			cursor.left = RotateLeft(cursor.left);
			return RotateRight(cursor);
		}

		// Right Left Case
		if (balance < -1 && valor < cursor.right.valor) {
			cursor.right = RotateRight(cursor.right);
			return RotateLeft(cursor);
		}

		return cursor;
	}

	static void preOrder(Node cursor) {
		if (cursor != null) {
			System.out.print(cursor.valor + " ");
			preOrder(cursor.left);
			preOrder(cursor.right);
		}
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		AVLTree cursor = new AVLTree();
		int x = 10;
		while (x > 0) {
			cursor.root = insert(cursor.root, in.nextInt());
			x--;
		}

		System.out.print("A arvore em pre Ordem é : ");
		AVLTree.preOrder(cursor.root);

	}
}