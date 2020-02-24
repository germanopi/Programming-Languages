import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int[] v = { 6, 3, 4, 5, 2, 7, 1, 9, 8, 0 };
		qsort(v, 0, v.length - 1);
		System.out.print(Arrays.toString(v));
	}

	private static void qsort(int[] v, int esq, int dir) {
		if (esq < dir) {
			int j = separar(v, esq, dir);
			qsort(v, esq, j - 1);
			qsort(v, j + 1, dir);
		}
	}

	private static int separar(int[] v, int esq, int dir) {
		int i = esq;
		int j = dir;
		// esq é o pivô
		while (i < j) {
			while (i < dir && v[i] <= v[esq]) {
				i++;
			}
			while (j > esq && v[j] >= v[esq]) {
				j--;
			}
			if (i < j) {
				trocar(v, i, j);
				i++;
				j--;
			}
		}
		trocar(v, esq, j);
		return j;
	}

	private static void trocar(int[] v, int i, int j) {
		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;

	}

}