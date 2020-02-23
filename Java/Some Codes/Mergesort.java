import java.util.Arrays;
import java.util.Scanner;

public class Mergesort {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int[] v = { 4, 6, 7, 3, 5, 1, 2, 8 };
		int[] w = new int[v.length];

		mergeSort(v, w, 0, v.length - 1);

		System.out.print(Arrays.toString(v));
	}

	private static void mergeSort(int[] v, int[] w, int inicio, int fim) {
		if (inicio < fim) {
			int meio = (inicio + fim) / 2;
			mergeSort(v, w, inicio, meio);
			mergeSort(v, w, meio + 1, fim);
			intercala(v, w, inicio, meio, fim);
		}

	}

	private static void intercala(int[] v, int[] w, int inicio, int meio, int fim) {
		for (int k = inicio; k <= fim; k++)
			w[k] = v[k];

		int i = inicio;
		int j = meio + 1;

		for (int k = inicio; k <= fim; k++) {
			if (i > meio)
				v[k] = w[j++];
			else if (j > fim)
				v[k] = w[i++];
			else if (w[i] < w[j])
				v[k] = w[i++];
			else
				v[k] = w[j++];
		}
	}

}
