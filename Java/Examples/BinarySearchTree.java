import java.util.Scanner;

public class BinarySearchTree {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Node cursor = new Node(in.nextInt());

		int x = 9;
		while (x > 0) {
			BSTInsert(cursor, in.nextInt());
			x--;
		}

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
		System.out.print(altura(cursor, 0, 0, 0));
		System.out.println();
		System.out.print("o numero desejado " + BSTSearch(cursor, 4));
		BSTDelete(cursor, 8);
		System.out.println();
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
		System.out.print(altura(cursor, 0, 0, 0));
	}

	public static Objeto BSTDeleteMin(Node cursor) {
		if(cursor.esq==null) {
			Node r=cursor.dir;
		    int  m=cursor.valor;
			Objeto aux=new Objeto(r,m);
			return aux;                           
		}else {
			Objeto aux=BSTDeleteMin(cursor.esq);
				cursor.esq=aux.r;
				int m=aux.m;
				Objeto aux2=new Objeto(cursor,m);
				return aux2;
			}
		}

	public static Node BSTDelete(Node cursor,int valor) {
		if(cursor==null) {
			return null;
		}else if(valor<cursor.valor) {
			cursor.esq=BSTDelete(cursor.esq,valor);
			return cursor;
		}else if(valor>cursor.valor) {
			cursor.dir=BSTDelete(cursor.dir,valor);
			return cursor;
		}else {
			if(cursor.esq==null) {
				return cursor.dir;
			}else if(cursor.dir==null) {
				return cursor.esq;
			}else {
				Objeto aux=BSTDeleteMin(cursor.dir);
				cursor.dir=aux.r;
				cursor.valor=aux.m;
				return cursor;
			}
		}
	}

	static class Objeto {
		Node r;
		int m;

		public Objeto(Node r, int m) {
			this.r = r;
			this.m = m;
		}

		public Node getR() {
			return r;
		}

		public void setR(Node r) {
			this.r = r;
		}

		public int getM() {
			return m;
		}

		public void setM(int m) {
			this.m = m;
		}

	}

	public static String BSTSearch(Node cursor, int valor) {

		if (cursor == null) {
			return "Não esta na árvore";
		} else if (valor == cursor.valor) {
			return "Está na árvore";
		} else if (valor < cursor.valor) {
			return BSTSearch(cursor.esq, valor);
		} else {
			return BSTSearch(cursor.dir, valor);
		}
	}

	public static Node BSTInsert(Node cursor, int valor) {
		if (cursor == null) {
			Node N = new Node(valor);

			return N;
		} else if (valor < cursor.valor) {
			cursor.esq = BSTInsert(cursor.esq, valor);
			return cursor;
		} else {
			cursor.dir = BSTInsert(cursor.dir, valor);
			return cursor;
		}
	}

	private static int altura(Node cursor, int r, int l, int h) {
		if (cursor == null) {
			return 0;
		} else {
			l = altura(cursor.esq, r, l, h);
			r = altura(cursor.dir, r, l, h);
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

	public Node(int valor) {
		this.valor = valor;
		this.dir = null;
		this.esq = null;
	}

}