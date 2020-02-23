import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = 30;
		int[] array = new int[n];

		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		int valor = 15;
		int m = 0;
		int l = 0;
		int r = 0;
		Search procura = new Search();
		System.out.print(procura.BinarySearch(array, valor, n, m, l, r));
	}
}

class Search {
	public int BinarySearch(int array[], int valor, int n, int m, int l, int r) {
		l = 0;
		r = n - 1;

		while (l <= r) {
			m = (l + r) / 2;
			if (array[m] > valor) {
				r = m - 1;
			} else {
				if (array[m] < valor) {
					l = m + 1;
				} else {
					return m;
				}

			}

		}
		return -1;
	}
}